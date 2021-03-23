package fasttrackit.vetclinicapplication.model.dto;

import fasttrackit.vetclinicapplication.model.entity.OwnerEntity;
import fasttrackit.vetclinicapplication.model.entity.PetEntity;
import fasttrackit.vetclinicapplication.model.entity.VetsEntity;

public class ConsultationDto {
    private Long id;
    private Long petId;
    private Long ownerId;
    private Long vetId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getVetId() {
        return vetId;
    }

    public void setVetId(Long vetId) {
        this.vetId = vetId;
    }

    @Override
    public String toString() {
        return "ConsultationDto{" +
                "id=" + id +
                ", petId=" + petId +
                ", ownerId=" + ownerId +
                ", vetId=" + vetId +
                '}';
    }
}