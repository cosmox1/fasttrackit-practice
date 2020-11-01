package tema3_cursul5;

import java.util.Comparator;

public class Assignment  {
  private Integer courseNumber;
  private String assignmentTitle;
  private String assignmentDescription;
  private String dificultyLevel;
  private Integer uniqueId;

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
    }

    public String getAssignmentDescription() {
        return assignmentDescription;
    }

    public void setAssignmentDescription(String assignmentDescription) {
        this.assignmentDescription = assignmentDescription;
    }

    public String getDificultyLevel() {
        return dificultyLevel;
    }

    public void setDificultyLevel(String dificultyLevel) {
        this.dificultyLevel = dificultyLevel;
    }

    public Integer getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Integer uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Assignment(Integer courseNumberInput, String dificultyLevelInput, String assignmentTitleInput) {
        this.courseNumber = courseNumberInput;
        this.dificultyLevel = dificultyLevelInput;
        this.assignmentTitle= assignmentTitleInput;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "courseNumber=" + courseNumber +
                ", assignmentTitle='" + assignmentTitle + '\'' +
                ", dificultyLevel='" + dificultyLevel + '\'' +
                '}';
    }

}
