package tema2_curs3si4;

import java.util.Scanner;

public class NumarPrim {
    public static void main(String[] args) {
        Scanner introdu = new Scanner(System.in);
        System.out.println("Scrie numarul");
        Integer a = introdu.nextInt();
        Integer i;
        boolean prim = false;
        for (i = 2; i <= a/2; ++i) {
            if (a % i == 0) {
                prim = true;
                break;
            }


        }
        if (!prim)
            System.out.println("numarul este prim "+ a);
        else
            System.out.println("numarul nu este prim "+ a);
    }}
