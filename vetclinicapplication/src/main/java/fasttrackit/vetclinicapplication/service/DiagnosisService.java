package fasttrackit.vetclinicapplication.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fasttrackit.vetclinicapplication.mesaje.DiagnosisMessageDtoSender;
import fasttrackit.vetclinicapplication.model.dto.DiagnosisDto;
import fasttrackit.vetclinicapplication.model.entity.DiagnosisEntity;
import fasttrackit.vetclinicapplication.repos.ConsultationRepos;
import fasttrackit.vetclinicapplication.repos.DiagnosisRepos;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class DiagnosisService {
    private final DiagnosisRepos repos;
    private final ConsultationRepos consultationRepos;
    private final RabbitTemplate rabbitTemplate;
    private final DirectExchange directExchange;

    public DiagnosisService(DiagnosisRepos repos, ConsultationRepos consultationRepos, RabbitTemplate rabbitTemplate, DirectExchange directExchange) {
        this.repos = repos;
        this.consultationRepos = consultationRepos;
        this.rabbitTemplate = rabbitTemplate;
        this.directExchange = directExchange;
    }
    public DiagnosisDto createNewDiagnosis(DiagnosisDto request){
        DiagnosisEntity newDiagnosis=new DiagnosisEntity();
        newDiagnosis.setConsultation(consultationRepos.findById(request.getConsultationId()).get());
        newDiagnosis.setDescription(request.getDescription());
        newDiagnosis.setRecomandations(request.getRecomandation());
        newDiagnosis.setTitleOfDiagnosis(request.getTitleOfDiagnosis());
        DiagnosisEntity save=this.repos.save(newDiagnosis);

        DiagnosisMessageDtoSender diagnosisMessageDtoSender= new DiagnosisMessageDtoSender();
        diagnosisMessageDtoSender.setConsultationId(newDiagnosis.getConsultation().getId());
        diagnosisMessageDtoSender.setDescription(newDiagnosis.getDescription());
        diagnosisMessageDtoSender.setRecommendations(newDiagnosis.getRecomandations());
        diagnosisMessageDtoSender.setTitle(newDiagnosis.getTitleOfDiagnosis());

        //aceeasi poveste ca si la crete consult
        ObjectMapper objectMapper=new ObjectMapper();
        try{
            String stringMessageConverted = objectMapper.writeValueAsString(diagnosisMessageDtoSender);
            rabbitTemplate.convertAndSend(directExchange.getName(), "diagnosis", stringMessageConverted);
        } catch (JsonProcessingException e) {
        }
        return mapEntityToDiagnosis(save);
    }
    public DiagnosisDto mapEntityToDiagnosis(DiagnosisEntity entity){
        DiagnosisDto response=new DiagnosisDto();
        response.setId(entity.getId());
        response.setConsultationId(entity.getConsultation().getId());
        response.setTitleOfDiagnosis(entity.getTitleOfDiagnosis());
        response.setDescription(entity.getDescription());
        response.setRecomandation(entity.getRecomandations());
        return response;
    }
}
