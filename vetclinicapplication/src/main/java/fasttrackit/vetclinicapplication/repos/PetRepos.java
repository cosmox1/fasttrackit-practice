package fasttrackit.vetclinicapplication.repos;

import fasttrackit.vetclinicapplication.model.entity.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepos extends JpaRepository<PetEntity, Long> {
}
