package ro.fastrackit.classroom;

import java.time.LocalDateTime;

public class Student implements Human {
    private String fname;
    private String lname;
    private Integer age;
    private String email;
    private Float grade;
    private Boolean finish;

    public Student(String givenfname, String givenlname, Integer givenage) {
        this.fname = givenfname;
        this.lname = givenlname;
        this.age = givenage;

    }

    //printare mai usoara a informatiei deoarece altfel ne arata unde se afla stocata informatia
    public String toString() {
        return "This student fname is:" + this.fname + "; and his lname is: " + this.lname + "; and he is this age: " + this.age;
    }

    //getters
    @Override
    public String getFname() {
        return this.fname;
    }

    @Override
    public String getLname() {
        return this.lname;

    }

    @Override
    public Integer getAge() {
        return this.age;

    }

    //setter
    @Override
    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public void setLname(String lname) {
        this.lname = lname;
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

}



