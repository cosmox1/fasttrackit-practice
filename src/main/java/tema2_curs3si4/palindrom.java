package tema2_curs3si4;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner numar=new Scanner(System.in);
        System.out.println("introdu numarul");
        int a= numar.nextInt();
        int original=a;
        int revers=0;
        int amintire;
        while (a!=0){
            amintire=a%10;
            revers=revers*10+amintire;
            a/=10;



        }
        if (original==revers)
            System.out.println("numarul este palindrom "+ original);
        else
            System.out.println("numarul nu este palindrom "+ original);

    }
}
