package fasttrackit.vetclinicapplication.service;

import fasttrackit.vetclinicapplication.model.dto.VetsDto;
import fasttrackit.vetclinicapplication.model.entity.VetsEntity;
import fasttrackit.vetclinicapplication.repos.VetRepos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VetService {
    private final VetRepos vetResitory;

    public VetService(VetRepos injectedVetResitory) {
        this.vetResitory = injectedVetResitory;
    }
    public VetsDto createNewVet(VetsDto request){
        VetsEntity newVet=new VetsEntity();
        newVet.setCnp(request.getCnp());
        newVet.setEmailadress(request.getEmailadress());
        newVet.setFirstname(request.getFirstname());
        newVet.setLastname(request.getLastname());
        newVet.setSpecialization(request.getSpecialization());
        newVet.setYearOfGraduation(request.getYearOfGraduation());
        VetsEntity savedVetEntity=this.vetResitory.save(newVet);
        return mapEntityToVetsRepos(savedVetEntity);

    }
    public VetsDto getVetById(Long vetId){
        Optional<VetsEntity> foundVetById=vetResitory.findById(vetId);
        if (!foundVetById.isPresent()){return null;}
        return foundVetById
                .map(entity -> mapEntityToVetsRepos(entity))
                .get();
    }
    public VetsDto updateVet(VetsDto request){
        VetsEntity vetsEntityToUpdate=new VetsEntity();
        vetsEntityToUpdate.setId(request.getId());
        vetsEntityToUpdate.setSpecialization(request.getSpecialization());
        vetsEntityToUpdate.setLastname(request.getLastname());
        vetsEntityToUpdate.setFirstname(request.getFirstname());
        vetsEntityToUpdate.setEmailadress(request.getEmailadress());
        vetsEntityToUpdate.setPhonenumber(request.getPhonenumber());
        vetsEntityToUpdate.setYearOfGraduation(request.getYearOfGraduation());
        VetsEntity updatedVetEntity=this.vetResitory.save(vetsEntityToUpdate);
        return mapEntityToVetsRepos(updatedVetEntity);
    }
    public List<VetsDto> findAllVets(){
//        List<VetsEntity> allVetEntities=this.vetResitory.findAll();
//        List<VetsDto> responseVetsList=new ArrayList<>();
//        for (VetsEntity vetsEntity:allVetEntities){
//            VetsDto vet=new VetsDto();
//            vet.setYearOfGraduation(vetsEntity.getYearOfGraduation());
//            vet.setSpecialization(vetsEntity.getSpecialization());
//            vet.setPhonenumber(vetsEntity.getPhonenumber());
//            vet.setLastname(vetsEntity.getLastname());
//            vet.setLastname(vetsEntity.getLastname());
//            vet.setEmailadress(vetsEntity.getEmailadress());
//            vet.setCnp(vetsEntity.getCnp());
//            responseVetsList.add(vet);}
        return this.vetResitory.findAll()
                .stream()
                .map(vetEntity->mapEntityToVetsRepos(vetEntity))
                .collect(Collectors.toList());


        }
        public void deleteVetById(Long vetId){
        this.vetResitory.deleteById(vetId);
        }

    public VetsDto mapEntityToVetsRepos(VetsEntity entity){
        VetsDto response=new VetsDto();
        response.setId(entity.getId());
        response.setCnp(entity.getCnp());
        response.setEmailadress(entity.getEmailadress());
        response.setFirstname(entity.getFirstname());
        response.setLastname(entity.getLastname());
        response.setPhonenumber(entity.getPhonenumber());
        response.setSpecialization(entity.getSpecialization());
        response.setYearOfGraduation(entity.getYearOfGraduation());
        return response;
    }
}
