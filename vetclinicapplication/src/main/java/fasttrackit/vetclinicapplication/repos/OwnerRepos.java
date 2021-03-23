package fasttrackit.vetclinicapplication.repos;

import fasttrackit.vetclinicapplication.model.entity.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepos extends JpaRepository<OwnerEntity,Long> {
}
