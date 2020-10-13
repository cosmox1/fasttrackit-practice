package ro.fastrackit.classroom;

public class PhdProfesor extends Profesor{
    private Integer age;
    private String Fname;
    private String Lanme;
    private Integer dateOfHiring;
    private String email;
    private Boolean phd;
    PhdProfesor (String Fname,String Lname, Integer age, Boolean phd){
        super( Fname,Lname, age, phd);
    }

}
