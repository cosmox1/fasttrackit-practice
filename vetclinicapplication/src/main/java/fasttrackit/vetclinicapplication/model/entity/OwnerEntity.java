package fasttrackit.vetclinicapplication.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name="owner")
public class OwnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String lastName;
    @Column
    private String  firstName;
    @Column
    private Integer cnp;
    @Column
    String phonenumber;
    @Column
    String email;
//@ManyToMany
//    private List<PetEntity> petList;// numele listei puse cu mappedBy in consultation

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private List<ConsultationEntity> consultations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getCnp() {
        return cnp;
    }

    public void setCnp(Integer cnp) {
        this.cnp = cnp;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public List<PetEntity> getPetList() {
//        return petList;
//    }
//
//    public void setPetList(List<PetEntity> petList) {
//        this.petList = petList;
//    }


    public List<ConsultationEntity> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<ConsultationEntity> consultations) {
        this.consultations = consultations;
    }
}
