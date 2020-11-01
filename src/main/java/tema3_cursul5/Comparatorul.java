package tema3_cursul5;

import java.util.Comparator;

public class Comparatorul implements Comparator<Assignment> {


    @Override
    public int compare(Assignment o1, Assignment o2) {
        if (o1.getCourseNumber().compareTo(o2.getCourseNumber()) == 0) {
            return o1.getDificultyLevel().compareTo(o2.getDificultyLevel());
        } else {
            return o1.getCourseNumber().compareTo(o2.getCourseNumber());
        }
    }
}