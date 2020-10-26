package ro.fastrackit.classroom;

public class FastTrackIT {
    public static void main(String[] args) {
//atribuim valori obiectului student A ce trece prin constructorul de aceeasi forma
     Student studentA = new Student ("Cosmin", "Panaite", 24);
//printam prin constructorul respectiv
     System.out.println(studentA);
     // setam noi numele prin setter
        studentA.setFname("Mihnea");
        studentA.setLname("Fasttrack");
        studentA.setAge(30);
        //printam informatia inserata prin setters
        System.out.println(studentA);

        Profesor profesorB= new Profesor("Mihnea","Fasttrack",24,true);
        //printam constructorul din profesor


    }
}
