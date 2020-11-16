package tema5_cursul7;

public class Box<T extends Human> {

    T inerobject;


    public Box(T inerobject) {
        this.inerobject = inerobject;
    }

    public T getinerobject() {
        return inerobject;
    }
}
