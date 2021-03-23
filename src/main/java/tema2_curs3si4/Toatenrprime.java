package tema2_curs3si4;

import java.util.Scanner;

public class Toatenrprime {
    public static void main(String[] args) {
        Scanner introdu = new Scanner(System.in);
        System.out.println("introdu numarul");
        int a = introdu.nextInt();
        int i;
        int numar = 0;
        String numerePrime = " ";


        for (i = 1; i < a; i++) {
            int numarare = 0;
            for (numar = i; numar >= 1; numar--)
                if (i % numar == 0) {
                    numarare = numarare + 1;


                }
            if (numarare == 2) {
                numerePrime = numerePrime + i + " ";

            }

        }
        System.out.println("numerele prime sunt");
        System.out.println(numerePrime);
    }
}



