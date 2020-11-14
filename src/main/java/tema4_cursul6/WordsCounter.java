package tema4_cursul6;

public class WordsCounter {
    public static void main(String[] args) {


        String input = "The quick brown fox jumps over the lazy dog";
        int counterApelat= counter(input);
        System.out.println("Number of words in the given string is " + " " + counterApelat);

    }

    private static int counter(String givenString) {  // metoda in sine
        int counter = 0;// initializam numararea de la 0
        if (givenString.charAt(0) != ' ') { // daca valoarea caracterului specificat de index
            counter++;                    //este diferita de spatiu atunci adauga 1 la count


        }
        for (int i = 0; i < givenString.length(); i++) { //strabate stringul

if (givenString.charAt(i)==' ' && givenString.charAt(i +1) != ' '){ //daca valoarea char in pct
    // i este spatiu si valoarea in urmatorul index este diferita de spatiu adauga cont
    counter++;
}
        }
return counter;
    }
}