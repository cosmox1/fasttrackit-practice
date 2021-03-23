package fasttrackit.vetclinicapplication.controller;

import fasttrackit.vetclinicapplication.model.dto.*;
import fasttrackit.vetclinicapplication.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetControler {
    private final PetService service;
    private final OwnerService serviceOwner;
    private final VetService serviceVet;
    private final ConsultationService serviceConsultation;
    private final DiagnosisService serviceDiagnosis;

    public PetControler(PetService service, OwnerService serviceOwner, VetService serviceVet, ConsultationService serviceConsultation, DiagnosisService serviceDiagnosis) {
        this.service = service;
        this.serviceOwner = serviceOwner;
        this.serviceVet = serviceVet;
        this.serviceConsultation = serviceConsultation;
        this.serviceDiagnosis = serviceDiagnosis;
    }

    @GetMapping("/api/petsHello/")
    public String salut() {
        return "<h1> Hello and welcome to the vetclinic </h1>";
    }

    @PostMapping("/api/pets")
    public ResponseEntity<Pet> cretepet2(@RequestBody Pet petRequest) {

        return ResponseEntity.ok(service.createNewPet(petRequest));
    }

    @GetMapping("/api/pets/{id}")
    public Pet findPet(@PathVariable Long id) {
        return service.getPetById(id);
    }

    @PutMapping("/api/pets")
    public ResponseEntity<Pet> updatePet(@RequestBody Pet updateRequest) {
        if (updateRequest.getId() == null || updateRequest.getId() <= 0) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(updateRequest);
        }
        return ResponseEntity.ok(service.updatePet(updateRequest));
    }

    @GetMapping("/api/pets")
    public List<Pet> getAllPets() {
        return service.findAllPets();
    }

    @DeleteMapping("/api/pets/{id}")
    public void deleteByID(@PathVariable("id") Long idToDelete) {
        this.service.deletePetById(idToDelete);
    }
//OwnerControler

    @PostMapping("/owner")//create
    public OwnerDto createNewOwner(@RequestBody OwnerDto newOwner) {
        return serviceOwner.createNewOwner(newOwner);
    }

    @GetMapping("/owner/{id}")//findbyid
    public OwnerDto findOwner(@PathVariable Long id) {
        return serviceOwner.getOwnerById(id);
    }

    @PutMapping("/owner")//update
    public ResponseEntity<OwnerDto> updateOwner(@RequestBody OwnerDto ownerDtoRequest) {
        if (ownerDtoRequest.getId() == null || ownerDtoRequest.getId() <= 0) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(ownerDtoRequest);
        }
        return ResponseEntity.ok(serviceOwner.updateOwner(ownerDtoRequest));
    }

    @GetMapping("/owner")//findall
    public List<OwnerDto> getAllOwners() {
        return serviceOwner.findAllOwners();
    }

    @DeleteMapping("/owner/{id}")//deletebyid
    public void deleteOwnerById(@PathVariable("id") Long ownerIdToDelete) {
        this.serviceOwner.deleteOwnerById(ownerIdToDelete);
    }

    //VetController
    @PostMapping("/vet")//create
    public VetsDto createNewVet(@RequestBody VetsDto newVet) {
        return serviceVet.createNewVet(newVet);
    }

    @GetMapping("/vet/{id}")//findbyid
    public VetsDto getVetById(@PathVariable Long id) {
        return serviceVet.getVetById(id);
    }

    @PutMapping("/vet")//update
    public ResponseEntity<VetsDto> updatedVet(@RequestBody VetsDto vetsDtoRequest) {
        if (vetsDtoRequest.getId() == null || vetsDtoRequest.getId() <= 0) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(vetsDtoRequest);
        }
        return ResponseEntity.ok(serviceVet.updateVet(vetsDtoRequest));
    }

    @GetMapping("/vet")//getallvets
    public List<VetsDto> getAllVets() {
        return serviceVet.findAllVets();
    }

    @DeleteMapping("/vet/{id}")
    public void deleteVetById(@PathVariable("id") Long vetIdToDelete) {
        this.serviceVet.deleteVetById(vetIdToDelete);
    }

    //ConsultController
    @PostMapping("/consult")//create
    public ConsultationDto createNewConsultation(@RequestBody ConsultationDto newConsult) {
        return serviceConsultation.createNewConsultation(newConsult);
    }

    @GetMapping("/consult/{id}")//findbyid
    public ConsultationDto getConsultationById(@PathVariable Long id) {
        return serviceConsultation.getConsultationById(id);
    }

//    @PutMapping("/consult")//update
//    public ResponseEntity<ConsultationDto> updatedConsultation(@RequestBody ConsultationDto consultationDtoRequest) {
//        if (consultationDtoRequest.getConsultationId() == null || consultationDtoRequest.getConsultationId() <= 0) {
//            return ResponseEntity
//                    .status(HttpStatus.BAD_REQUEST)
//                    .body(consultationDtoRequest);
//        }
//        return ResponseEntity.ok(serviceConsultation.updateConsultation(consultationDtoRequest));
//    }

    @GetMapping("/consult")//getallconsults
    public List<ConsultationDto> getAllConsultations() {
        return serviceConsultation.findAllConsultations();
    }

    @DeleteMapping("/consult/{id}")
    public void deleteConsultationById(@PathVariable("id") Long consultIdToDelete) {
        this.serviceConsultation.deleteConsultation(consultIdToDelete);
    }
    //diagnosisController
    @PostMapping("/diagnosis")
    public ResponseEntity<DiagnosisDto> createNewDiagnosis(@RequestBody DiagnosisDto diagnosisDtoRequest){
        return ResponseEntity.ok(serviceDiagnosis.createNewDiagnosis(diagnosisDtoRequest));
    }


}







