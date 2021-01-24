package fasttrackit.vetclinicapplication.controller;

import fasttrackit.vetclinicapplication.model.Pet;
import fasttrackit.vetclinicapplication.service.PetService;
import org.springframework.web.bind.annotation.*;

@RestController
public class PetControler{
    private final PetService service;

    public PetControler(PetService injectedservice) {
        this.service = injectedservice;
    }

    @GetMapping("/api/pets/")
    public String salut(){
        return "<h1> Hello and welcome to the vetclinic </h1>";
    }
    @PostMapping("/api/pet2")
    public Pet cretepet2(@RequestBody Pet petRequest){

        return service.createNewPet(petRequest);
    }

}



