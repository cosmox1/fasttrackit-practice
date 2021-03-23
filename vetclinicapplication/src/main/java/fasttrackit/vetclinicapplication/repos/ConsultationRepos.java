package fasttrackit.vetclinicapplication.repos;

import fasttrackit.vetclinicapplication.model.entity.ConsultationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ConsultationRepos extends JpaRepository<ConsultationEntity,Long> {
//
@Query(value = "select * from consultation c where c.owner_id = :owner_id and c.pet_id = :pet_id", nativeQuery = true)
Optional<ConsultationEntity> findConsultationByOwnerAndPet(@Param("owner_id") Long ownerId,
                                                           @Param("pet_id") Long petId);
}
