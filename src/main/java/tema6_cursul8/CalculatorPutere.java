package tema6_cursul8;

import java.util.Scanner;

public class CalculatorPutere {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("introdu doua numere");
        Long a = input.nextLong();
        Long b = input.nextLong();
        Double rezultatfinal = power(a, b);
        System.out.println("rezultatul este " + rezultatfinal);

    }


    public static Double power(Long primulnumar, Long numaruldoi) throws Exception {
        if (primulnumar <= 0 || numaruldoi <= 0) {
            throw new Exception("nu putem introduce numere negative, numerele introduse sunt " + primulnumar + " " + numaruldoi);
        }
        return Math.pow(primulnumar, numaruldoi);
    }
}
