package fasttrackit.vetclinicapplication.service;

import fasttrackit.vetclinicapplication.model.Pet;
import fasttrackit.vetclinicapplication.model.entity.PetEntity;
import fasttrackit.vetclinicapplication.repos.PetRepos;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PetService {
    private final PetRepos repository;
    public PetService(PetRepos injectedPetRepos){
        this.repository=injectedPetRepos;
    };

    public Pet createNewPet(Pet request){
        PetEntity newPet= new PetEntity();
        newPet.setPets(request.getPets());
        newPet.setId(request.getId());
        newPet.setName(request.getName());
       PetEntity savedPet= this.repository.save(newPet);
       Pet responseobject=new Pet();
       responseobject.setId(savedPet.getId());
       responseobject.setName(savedPet.getName());
       responseobject.setPets(savedPet.getPets());
        return responseobject;
    }
    public Pet findPet(Long petID){
        Optional<Pet> foundEntity=repository.findById(petID);
        if (!foundEntity.isPresent()){
            return null;
        }
return foundEntity.map(entityToMap -> mapEntityToPetRepos(entityToMap)).get();
    }
}
