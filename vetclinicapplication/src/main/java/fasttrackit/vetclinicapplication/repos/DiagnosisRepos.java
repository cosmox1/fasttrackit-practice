package fasttrackit.vetclinicapplication.repos;

import fasttrackit.vetclinicapplication.model.entity.DiagnosisEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosisRepos extends JpaRepository<DiagnosisEntity,Long> {
}
