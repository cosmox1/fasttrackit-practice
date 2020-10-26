package ro.fastrackit.classroom;

public class Profesor implements Human {
    private String fname;
    private String lname;
    private Integer age;
    private Integer dateOfHiring;
    private String email;
    private Boolean phd;

    public Profesor(String givFname, String givLname, Integer givage, Boolean givphd) {
        this.fname = givFname;
        this.lname = givLname;
        this.age = givage;
        this.phd = givphd;

    }

    @Override
    public String getFname() {
        return fname;
    }

    @Override
    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String getLname() {
        return lname;
    }

    @Override
    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String givenEmail) {
        this.email = givenEmail;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void setType(String type) {

    }


    public String toString() {
        return "This profesor fname is:" + this.fname + "; and his lname is: " + this.lname + "; and he is this age: " + this.age;
    }
}


