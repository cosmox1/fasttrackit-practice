package ro.fastrackit.classroom;

import java.time.LocalDateTime;
public class Student {
    private String fname;
    private String lname;
    private Integer age;
    private String email;
    private Float grade;
    private Boolean finish;

    public Student (String givenfname, String givenlname, Integer givenage) {
        this.fname=givenfname;
        this.lname=givenlname;
this.age=givenage;

    }
    //printare mai usoara a informatiei deoarece altfel ne arata unde se afla stocata informatia
    public String toString(){
        return "This student fname is:"+ this.fname+ "; and his lname is: "+this.lname+ "; and he is this age: "+this.age;
    }
    //getters
public String getFname(){
        return this.fname;
}
public String getLname(){
        return this.lname;

}
public Integer getage(){
        return this.age;

}
//setter
public void setFname(String fname) {
    this.fname = fname;
}
public void setLname(String lname){
        this.lname=lname;
}
public void setage(Integer age){
        this.age=age;
}

}




