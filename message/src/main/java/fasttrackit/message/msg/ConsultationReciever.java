package fasttrackit.message.msg;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fasttrackit.message.model.ConsultationMessageReceiver;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
@Component
@RabbitListener(queues = "consultations2")
public class ConsultationReciever {



        @RabbitHandler
        public void receiveConsultation(String consultationMessage){

            ObjectMapper objectMapper = new ObjectMapper(); //cand este primit un string Json, se foloseste ObjectMapper pentru a crea un obiect din acesta

            try {
                ConsultationMessageReceiver messageReceived = objectMapper.readValue(consultationMessage, ConsultationMessageReceiver.class); //obiectul este creat dupa clasa model ConsultationMessageReceiver folosing datele (valorile) din stringul Json
                System.out.println("VetName: "+messageReceived.getVetName());
                System.out.println("PetName: "+messageReceived.getPetName());
                System.out.println("OwnerName: "+messageReceived.getOwnerName());
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
//        System.out.println(" ["+ Date.from(Instant.now())+"] Received: " + consultationMessage);
        }
    }


