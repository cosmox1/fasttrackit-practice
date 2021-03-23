package fasttrackit.vetclinicapplication.model.dto;

public class DiagnosisDto {
    private Long id;
    private Long consultationId;
    private String recomandation;
    private String description;
    private String titleOfDiagnosis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(Long consultationId) {
        this.consultationId = consultationId;
    }

    public String getRecomandation() {
        return recomandation;
    }

    public void setRecomandation(String recomandation) {
        this.recomandation = recomandation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitleOfDiagnosis() {
        return titleOfDiagnosis;
    }

    public void setTitleOfDiagnosis(String titleOfDiagnosis) {
        this.titleOfDiagnosis = titleOfDiagnosis;
    }

    @Override
    public String toString() {
        return "DiagnosisDto{" +
                "id=" + id +
                ", consultationId=" + consultationId +
                ", recomandation='" + recomandation + '\'' +
                ", description='" + description + '\'' +
                ", titleOfDiagnosis='" + titleOfDiagnosis + '\'' +
                '}';
    }
}
