package fasttrackit.vetclinicapplication.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fasttrackit.vetclinicapplication.mesaje.ConsultationMessageDtoSender;
import fasttrackit.vetclinicapplication.model.dto.ConsultationDto;
import fasttrackit.vetclinicapplication.model.entity.ConsultationEntity;
import fasttrackit.vetclinicapplication.repos.ConsultationRepos;
import fasttrackit.vetclinicapplication.repos.OwnerRepos;
import fasttrackit.vetclinicapplication.repos.PetRepos;
import fasttrackit.vetclinicapplication.repos.VetRepos;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ConsultationService {
    private final ConsultationRepos repos;
    private final PetRepos petRepos;
    private final VetRepos vetRepos;
    private final OwnerRepos ownerRepos;
    private final RabbitTemplate rabbitTemplate;
    private final DirectExchange directExchange;

    public ConsultationService(ConsultationRepos repos, PetRepos petRepos, VetRepos vetRepos, OwnerRepos ownerRepos, RabbitTemplate rabbitTemplate, DirectExchange directExchange) {
        this.repos = repos;
        this.petRepos = petRepos;
        this.vetRepos = vetRepos;
        this.ownerRepos = ownerRepos;
        this.rabbitTemplate = rabbitTemplate;
        this.directExchange = directExchange;
    }

    //create
    public ConsultationDto createNewConsultation(ConsultationDto request){
        ConsultationEntity newConsultation=new ConsultationEntity();
      Optional <ConsultationEntity> optionalConsultationEntity=repos.findConsultationByOwnerAndPet(request.getOwnerId(),request.getPetId());
        if (optionalConsultationEntity.isPresent()) {
            newConsultation=optionalConsultationEntity.get();
        }    else {newConsultation.setPet(petRepos.findById(request.getPetId()).get());
        newConsultation.setOwner(ownerRepos.findById(request.getOwnerId()).get());}
        newConsultation.setVet(vetRepos.findById(request.getVetId()).get());
        ConsultationEntity save=this.repos.save(newConsultation);

        ConsultationMessageDtoSender consultationCreateMsg=new ConsultationMessageDtoSender();
        consultationCreateMsg.setPetName(newConsultation.getPet().getName());
        consultationCreateMsg.setOwnerName(newConsultation.getOwner().getFirstName()+" "+newConsultation.getOwner().getLastName());
        consultationCreateMsg.setVetName(newConsultation.getVet().getFirstname()+" "+ newConsultation.getVet().getLastname());

        //avem nevoie de Json si vom folosi o conversie din obj in json
        ObjectMapper objectMapper=new ObjectMapper();
        try {//folosit pt a prinde si nu lasa app sa crape in caz de error de conversie
            String convertedMsj=objectMapper.writeValueAsString(consultationCreateMsg);
            rabbitTemplate.convertAndSend(directExchange.getName(),"consultation",convertedMsj);
        } catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return mapEntityToConsultationRepos(save);
    }
    public ConsultationDto getConsultationById(Long consultId){
        Optional<ConsultationEntity>foundConsultatioById=repos.findById(consultId);
        if (!foundConsultatioById.isPresent()){return null;}
        return foundConsultatioById
                .map(entity -> mapEntityToConsultationRepos(entity))
                .get();
    }
//    public ConsultationDto updateConsultation(ConsultationDto request){
//        ConsultationEntity consultationEntityToUpdate=new ConsultationEntity();
//        consultationEntityToUpdate.setConsultationId(request.getConsultationId());
//        consultationEntityToUpdate.setConsultedPet(request.getAnimalConsulted());
//        consultationEntityToUpdate.setVet(request.getVet());
//        consultationEntityToUpdate.setOwnerAnimalCosnulted(request.getOwnersOfConsultedAnimals());
//        ConsultationEntity updatedConsultationEntity=this.repos.save(consultationEntityToUpdate);
//        return mapEntityToConsultationRepos(updatedConsultationEntity);
//    }
    public List<ConsultationDto> findAllConsultations(){
//        List<ConsultationEntity> foundConsultationEntity=repos.findAll();
//        return foundConsultationEntity.stream().map(entity -> mapEntityToConsultationRepos(entity))
//                .collect(Collectors.toList());
        return this.repos.findAll()
                .stream()
                .map(entity -> mapEntityToConsultationRepos(entity))
                .collect(Collectors.toList());
    }
    public void deleteConsultation(Long id){

        this.repos.deleteById(id);
    }
    //mapare
    public ConsultationDto mapEntityToConsultationRepos(ConsultationEntity entity){
        ConsultationDto response=new ConsultationDto();
        response.setId(entity.getId());
        response.setPetId(entity.getPet().getId());
        response.setVetId(entity.getVet().getId());
        response.setOwnerId(entity.getOwner().getId());
        return response;
    }
}
