package fasttrackit.vetclinicapplication.repos;

import fasttrackit.vetclinicapplication.model.entity.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PetRepos extends JpaRepository<PetEntity, Long> {
}
