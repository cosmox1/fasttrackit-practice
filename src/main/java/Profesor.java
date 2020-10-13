public class Profesor {
    private String Fname;
    private String Lname;
    private Integer age;
    private Integer dateOfHiring;
    private String email;
    private Boolean phd;
    public Profesor(String givFname, String givLname, Integer givage, Boolean givphd){
        this.Fname=givFname;
        this.Lname=givLname;
        this.age=givage;
        this.phd=givphd;

        }
        public String toString(){
        return "This profesor fname is:"+ this.Fname+ "; and his lname is: "+Lname+ "; and he is this age: "+this.age +" "+this.phd;
        }
    }


