package tema4_cursul6;

public class ClasaPtObiect {
    String nume;
    int varsta;

    public ClasaPtObiect(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "ClasaPtObiect{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
