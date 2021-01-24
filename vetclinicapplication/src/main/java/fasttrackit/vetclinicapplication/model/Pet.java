package fasttrackit.vetclinicapplication.model;

public class Pet {
    private long id;
    private String name;
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
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}
