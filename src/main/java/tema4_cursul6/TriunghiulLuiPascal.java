package tema4_cursul6;

import java.util.Scanner;

public class TriunghiulLuiPascal {
    public static void main(String[] args) {
        int no_row, c = 1;
        int blk,i,j;


        System.out.print("Introdu numarul de randuri: ");
        Scanner in = new Scanner(System.in);
        no_row = in.nextInt();
        for (i = 0; i < no_row; i++) { //parcurgem linile
            for (blk = 1; blk <= no_row - i; blk++)
            System.out.print(" ");
            for (j = 0; j <= i; j++) { //parcurge coloana
                if (j == 0 || i == 0) //daca randul sau coloana sunt 0 atunci coloana C este 1
                    c = 1;
                else
                    c = c * (i - j + 1) / j;
                System.out.print(" " + c);
            }
            System.out.print("\n");
        }
    }
}