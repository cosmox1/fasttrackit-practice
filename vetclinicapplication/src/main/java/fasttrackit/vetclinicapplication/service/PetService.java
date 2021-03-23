package fasttrackit.vetclinicapplication.service;

import fasttrackit.vetclinicapplication.model.dto.Pet;
import fasttrackit.vetclinicapplication.model.entity.PetEntity;
import fasttrackit.vetclinicapplication.repos.PetRepos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PetService {
    private final PetRepos repository;
    public PetService(PetRepos injectedPetRepos){
        this.repository=injectedPetRepos;
    };

    public Pet createNewPet(Pet request){
        PetEntity newPet= new PetEntity();
        newPet.setPets(request.getPets());
       // newPet.setId(request.getId());
        newPet.setName(request.getName());

       PetEntity savedPet= this.repository.save(newPet);

      // Pet responseobject=new Pet();
      // responseobject.setId(savedPet.getId());
      // responseobject.setName(savedPet.getName());
      // responseobject.setPets(savedPet.getPets());
       // return responseobject;
        return mapEntityToPetResponse(savedPet);
    }
    public Pet getPetById(Long petID) {
        Optional<PetEntity> foundEntityById= repository.findById(petID);
        //v1
//        if (foundEntityById.isPresent()){
//        PetEntity entity=foundEntityById.get();
//        Pet response=new Pet();
//        response.setPets(entity.getPets());
//        response.setName(entity.getName());
//        response.setId(entity.getId());}
        //return response

        //v2
        if (!foundEntityById.isPresent()){
            return null;
        }
       // Pet petResponse=foundEntityById.map(entityToMap ->{
           // Pet response2=new Pet();
         //   response2.setPets(entityToMap.getPets());
          //  response2.setName(entityToMap.getName());
        //    response2.setId(entityToMap.getId());
           // return response2;
        //}).get();
        return foundEntityById
        .map(entityTomap ->mapEntityToPetResponse(entityTomap))
                .get();
    }
    public Pet updatePet(Pet req){
        PetEntity entityToUpdate=new PetEntity();
        entityToUpdate.setId(req.getId());//DIFERENCE BETWEEN UPDATE AND SAVE
        entityToUpdate.setName(req.getName());
        entityToUpdate.setPets(req.getPets());

        PetEntity updatedEntity= this.repository.save(entityToUpdate);

        //Pet response = new Pet();
        //response.setPets(updatedEntity.getPets());
       // response.setName(updatedEntity.getName());
       // response.setId(updatedEntity.getId());
       // return  response;
        return mapEntityToPetResponse(updatedEntity);
    }
    public List<Pet> findAllPets(){
        //v1
//        List<PetEntity> allEntities = this.repository.findAll();
//        List<Pet> responseList = new ArrayList<>();
//        for (PetEntity entity: allEntities){
//            Pet pet =new Pet();
//            pet.setName(entity.getName());
//            pet.setPets(entity.getPets());
//            pet.setId(entity.getId());
//            responseList.add(pet);
//        }
        //return responseList;
        //v2
        return this.repository.findAll()
                .stream()
                .map(petEntity ->
                        //se modifica datorita metodei mai jos e varianta veche
                //Pet pet2 = new Pet();
               // pet2.setId(petEntity.getId());
               // pet2.setPets(petEntity.getPets());
               // pet2.setName(petEntity.getName());
               // return pet2;
                    mapEntityToPetResponse(petEntity)
                ).collect(Collectors.toList());
    }
    public void deletePetById(Long id){
        this.repository.deleteById(id);
    }
    // atunci cand se repeta aceeasi logica in mai multe metode



private Pet mapEntityToPetResponse(PetEntity entity){
        Pet response= new Pet();
        response.setId(entity.getId());
        response.setPets(entity.getPets());
        response.setName(entity.getName());
        return response;
}
}
