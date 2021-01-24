package fasttrackit.vetclinicapplication.controller;

import fasttrackit.vetclinicapplication.model.Pet;
import fasttrackit.vetclinicapplication.model.PetEnums;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiControler {
    @GetMapping("/api/hi1/")
    public String getHiMsg(){
return "salut ";
    }
    @GetMapping("/basic/")
    public String helpp(){
        return "asd";

    }
    @GetMapping("/api/pets1/")
    public String getHiPet(){
        return "<h1>hello and welcome!</h1>";

    }
    
}
