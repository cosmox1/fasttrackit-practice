package fasttrackit.vetclinicapplication.service;

import fasttrackit.vetclinicapplication.model.dto.OwnerDto;
import fasttrackit.vetclinicapplication.model.entity.OwnerEntity;
import fasttrackit.vetclinicapplication.repos.OwnerRepos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OwnerService {
    private final OwnerRepos repos;

    public OwnerService(OwnerRepos injectedRepos) {
        this.repos = injectedRepos;}
        public OwnerDto createNewOwner(OwnerDto request){
            OwnerEntity newOwner=new OwnerEntity();
            newOwner.setCnp(request.getCnp());
            newOwner.setEmail(request.getEmail());
            newOwner.setFirstName(request.getfName());
            newOwner.setLastName(request.getlName());
            newOwner.setPhonenumber(request.getPhonenumber());
            OwnerEntity savedEntity=this.repos.save(newOwner);
            return mapEntityToOwnerRepos(savedEntity);
        }
        public OwnerDto getOwnerById(Long ownerId){
            Optional<OwnerEntity> foundOwnerById=repos.findById(ownerId);
            if (!foundOwnerById.isPresent()){
                return null;
            }
            return foundOwnerById
                    .map(entity -> mapEntityToOwnerRepos(entity))
                    .get();
        }
        public OwnerDto updateOwner(OwnerDto request) {
            OwnerEntity ownerEntityToUpdate = new OwnerEntity();
            ownerEntityToUpdate.setId(request.getId());
            ownerEntityToUpdate.setPhonenumber(request.getPhonenumber());
            ownerEntityToUpdate.setLastName(request.getlName());
            ownerEntityToUpdate.setFirstName(request.getfName());
            ownerEntityToUpdate.setEmail(request.getEmail());
            ownerEntityToUpdate.setCnp(request.getCnp());

            OwnerEntity updatedOwnerEntity = this.repos.save(ownerEntityToUpdate);
            return mapEntityToOwnerRepos(updatedOwnerEntity);

        }
        public List<OwnerDto> findAllOwners() {
//            List<OwnerEntity> allOwnerEntities = this.repos.findAll();
//            List<OwnerDto> responseOwnerList = new ArrayList<>();
//            for (OwnerEntity ownerEntity : allOwnerEntities) {
//                OwnerDto owner = new OwnerDto();
//                owner.setPhonenumber(ownerEntity.getPhonenumber());
//                owner.setlName(ownerEntity.getLastName());
//                owner.setfName(ownerEntity.getFirstName());
//                owner.setEmail(ownerEntity.getEmail());
//                owner.setCnp(ownerEntity.getCnp());
//                responseOwnerList.add(owner);
         //   }
            return this.repos.findAll()
                    .stream()
                    .map(ownerEntity->mapEntityToOwnerRepos(ownerEntity))
                    .collect(Collectors.toList());
        }
        public void deleteOwnerById(Long ownerId){
        this.repos.deleteById(ownerId);
        }
        public OwnerDto mapEntityToOwnerRepos(OwnerEntity entity){
        OwnerDto response= new OwnerDto();
        response.setId(entity.getId());
        response.setCnp(entity.getCnp());
        response.setEmail(entity.getEmail());
        response.setfName(entity.getFirstName());
        response.setlName(entity.getLastName());
        response.setPhonenumber(entity.getPhonenumber());
        return response;
        }
    }

