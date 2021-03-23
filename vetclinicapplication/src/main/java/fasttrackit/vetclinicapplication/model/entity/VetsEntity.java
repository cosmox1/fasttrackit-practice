package fasttrackit.vetclinicapplication.model.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "vet")
public class VetsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private Integer cnp;
    @Column
    private Date yearOfGraduation;
    @Column
    private String specialization;
    @Column
    private String phonenumber;
    @Column
    private String emailadress;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ConsultationEntity> consultations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getCnp() {
        return cnp;
    }

    public void setCnp(Integer cnp) {
        this.cnp = cnp;
    }

    public Date getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(Date yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmailadress() {
        return emailadress;
    }

    public void setEmailadress(String emailadress) {
        this.emailadress = emailadress;
    }

    public List<ConsultationEntity> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<ConsultationEntity> consultations) {
        this.consultations = consultations;
    }
}
