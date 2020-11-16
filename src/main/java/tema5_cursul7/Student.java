package tema5_cursul7;

public class Student implements Human {
    String fname;
    String lname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    Student(String numeintrodus, String prenumeintrodus) {
        this.fname = numeintrodus;
        this.lname = prenumeintrodus;

    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}

