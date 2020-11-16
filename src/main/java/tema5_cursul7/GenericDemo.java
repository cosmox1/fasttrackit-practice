package tema5_cursul7;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<? extends Human> humanList = createStudentlist();
        System.out.println("lista de oameni" + humanList);


    }

    static ArrayList<Student> createStudentlist() {
        ArrayList<Student> students = new ArrayList<>();
        Student daniel = new Student("Pop", "Dani");
        Student mihai = new Student("Boss", "Mihaita");
        Student ioana = new Student("Boanta", "Ioana");
        students.add(daniel);
        students.add(mihai);
        students.add(ioana);

        return students;

    }


}
