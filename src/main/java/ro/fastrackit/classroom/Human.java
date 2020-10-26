package ro.fastrackit.classroom;

public interface Human {


    String getFname();

    void setFname(String fname);

    String getLname();

    void setLname(String lname);

    Integer getAge();

    void setAge(Integer age);

    public abstract String getEmail();

    public void setEmail(String givenEmail);
    public abstract String getType();
    void setType(String type);



}

