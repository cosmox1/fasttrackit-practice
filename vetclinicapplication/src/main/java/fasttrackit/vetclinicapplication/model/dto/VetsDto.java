package fasttrackit.vetclinicapplication.model.dto;

import java.util.Date;

public class VetsDto {
    private Long id;
    private String firstname;
    private String lastname;
    private Integer cnp;
    private Date yearOfGraduation;
    private String specialization;
    private String phonenumber;
    private String emailadress;

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

    @Override
    public String toString() {
        return "VetsDto{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", cnp=" + cnp +
                ", yearOfGraduation=" + yearOfGraduation +
                ", specialization='" + specialization + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", emailadress='" + emailadress + '\'' +
                '}';
    }
}
