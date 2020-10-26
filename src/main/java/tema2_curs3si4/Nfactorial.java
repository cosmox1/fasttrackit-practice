package tema2_curs3si4;

import java.util.Scanner;

public class Nfactorial {
    public static void main(String[] args) {
            Scanner numar = new Scanner(System.in);
            System.out.println("Scrie numarul");
            Integer a= numar.nextInt();
            Integer i,factor=1;
            for (i=1;i<=a;i++){
                factor=factor*i;
            }
            System.out.println("numarul factorial este "+factor);
        }

    }




