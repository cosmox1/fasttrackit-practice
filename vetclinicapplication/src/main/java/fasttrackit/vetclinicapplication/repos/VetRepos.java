package fasttrackit.vetclinicapplication.repos;

import fasttrackit.vetclinicapplication.model.entity.VetsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepos extends JpaRepository<VetsEntity, Long> {
}
