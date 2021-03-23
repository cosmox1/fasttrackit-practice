package fasttrackit.vetclinicapplication.model.entity;

import fasttrackit.vetclinicapplication.aditionals.PetEnums;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.List;

@Entity(name="pet")
public class PetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column(name="pet_species")
    @Enumerated(EnumType.STRING)
    private PetEnums pets;

@OneToMany(cascade = CascadeType.ALL,mappedBy = "pet")
   private List<ConsultationEntity> consultations;

    public List<ConsultationEntity> getConsultationEntity() {
        return consultations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetEnums getPets() {
        return pets;
    }

    public void setPets(PetEnums pets) {
        this.pets = pets;
    }

    public List<ConsultationEntity> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<ConsultationEntity> consultations) {
        this.consultations = consultations;
    }

    @Override
    public String toString() {
        return "PetEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pets=" + pets +
                ", consultations=" + consultations +
                '}';
    }
}
