package fasttrackit.vetclinicapplication.model.dto;

import fasttrackit.vetclinicapplication.aditionals.PetEnums;

public class Pet {
    private Long id;
    private String name;
    private PetEnums pets;

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

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}
