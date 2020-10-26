package tema2_curs3si4;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("introdu doua numere");
        double operator1=input.nextDouble();
        double operator2=input.nextDouble();
        double result=0;
        System.out.println("Introdu unul dintre operatorii urmatori (+,-,/,*): ");
        char operatorEcuatie=input.next().charAt(0);
        switch (operatorEcuatie){
            case '+':
                result=operator1+operator2;
                break;
            case '-':
                result=operator1-operator2;
                break;
            case '/':
                result=operator1/operator2;
                break;

            case '*':
                result = operator1 * operator2;
                break;
            default:
                System.out.println("Eroare !! operator incorect ");
                return;


        }
        System.out.printf("%.1f %c %.1f = %.1f",operator1, operatorEcuatie , operator2 , result );



    }
}