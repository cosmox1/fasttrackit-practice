package fasttrackit.vetclinicapplication.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "consultation")
public class ConsultationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private PetEntity pet;
    @ManyToOne
    private OwnerEntity owner;
    @ManyToOne
    private VetsEntity vet;
    //
//    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "petList")
//    private List<OwnerEntity> ownerEntityList ;
    @OneToMany(cascade = CascadeType.ALL)
    private List<DiagnosisEntity> diagnosisList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PetEntity getPet() {
        return pet;
    }

    public void setPet(PetEntity pet) {
        this.pet = pet;
    }

    public OwnerEntity getOwner() {
        return owner;
    }

    public void setOwner(OwnerEntity owner) {
        this.owner = owner;
    }

    public VetsEntity getVet() {
        return vet;
    }

    public void setVet(VetsEntity vet) {
        this.vet = vet;
    }

    public List<DiagnosisEntity> getDiagnosisList() {
        return diagnosisList;
    }

    public void setDiagnosisList(List<DiagnosisEntity> diagnosisList) {
        this.diagnosisList = diagnosisList;
    }

    @Override
    public String toString() {
        return "ConsultationEntity{" +
                "id=" + id +
                ", pet=" + pet +
                ", owner=" + owner +
                ", vet=" + vet +
                ", diagnosisList=" + diagnosisList +
                '}';
    }
}
