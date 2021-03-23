package fasttrackit.vetclinicapplication.model.entity;

import javax.persistence.*;

@Entity(name="diagnosis")
public class DiagnosisEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String titleOfDiagnosis;
    @Column
    private String recomandations;
    @Column
    private String description;
    @ManyToOne
    private ConsultationEntity consultation;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleOfDiagnosis() {
        return titleOfDiagnosis;
    }

    public void setTitleOfDiagnosis(String titleOfDiagnosis) {
        this.titleOfDiagnosis = titleOfDiagnosis;
    }

    public String getRecomandations() {
        return recomandations;
    }

    public void setRecomandations(String recomandations) {
        this.recomandations = recomandations;
    }

    public ConsultationEntity getConsultation() {
        return consultation;
    }

    public void setConsultation(ConsultationEntity consultation) {
        this.consultation = consultation;
    }

    @Override
    public String toString() {
        return "DiagnosisEntity{" +
                "id=" + id +
                ", titleOfDiagnosis='" + titleOfDiagnosis + '\'' +
                ", recomandations='" + recomandations + '\'' +
                ", description='" + description + '\'' +
                ", consultation=" + consultation +
                '}';
    }
}
