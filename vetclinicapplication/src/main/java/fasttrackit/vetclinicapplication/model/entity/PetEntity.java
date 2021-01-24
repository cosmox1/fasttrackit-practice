package fasttrackit.vetclinicapplication.model.entity;

import fasttrackit.vetclinicapplication.model.PetEnums;

import javax.persistence.*;

@Entity(name="Pet")
public class PetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column(name="Pet_species")
    @Enumerated(EnumType.STRING)
    private PetEnums pets;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    @Override
    public String toString() {
        return "PetEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}
