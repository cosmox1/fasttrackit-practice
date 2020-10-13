package ro.fastrackit.classroom;

public class FastTrackIT {
    public static void main(String[] args) {
//atribuim valori obiectului student A ce trece prin constructorul de aceeasi forma
     Student A = new Student ("Cosmin", "Panaite", 24);
//printam prin constructorul respectiv
     System.out.println(A);
     // setam noi numele prin setter
        A.setFname("Mihnea");
        A.setLname("Fasttrack");
        A.setage(30);
        //printam informatia inserata prin setters
        System.out.println(A);

        Profesor B= new Profesor("Mihnea","Fasttrack",24,null);
        //printam constructorul din profesor
        System.out.println(B);
PhdProfesor C=new PhdProfesor("Florin","Track",24, null);
System.out.println(C);

    }
}
