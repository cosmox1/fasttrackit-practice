package tema6_cursul8;

import java.util.Scanner;

public class PasswordCheckWithTrow {
    public static void main(String[] args) throws Exception {
        System.out.println("introdu o parola valida");
        Scanner input = new Scanner(System.in);
        String pasW = input.nextLine();
        verificareParola(pasW);


    }

    public static boolean verificareParola(String parolaDeIntrodus) throws Exception {
        if (parolaDeIntrodus.length() < 12) {
            throw new Exception(" parola detine mai putin de 12 caractere, numarul de caractere detinute este " + parolaDeIntrodus.length());
        }
        int charCounter = 0;
        int digitCounter = 0;
        int finalDigitCounter = digitCounter;
        int finalCharCounter = charCounter;
        for (int i = 0; i < parolaDeIntrodus.length(); i++) {
            char caracter = parolaDeIntrodus.charAt(i);
            if (isLetter(caracter))
                charCounter++;
            finalCharCounter = charCounter;
            if (isDigit(caracter))
                digitCounter++;
            finalDigitCounter = digitCounter;
        }
        if (finalDigitCounter < 3) {
            throw new Exception("nu avem 3 digits");

        }
        if (finalCharCounter != 0)
            System.out.println(parolaDeIntrodus);
        else throw new Exception("nu contine caractere");

        return (charCounter >= 3 && digitCounter >= 3);
    }

    public static boolean isLetter(char caracter) {
        caracter = Character.toUpperCase(caracter);
        return (caracter >= 'A' && caracter <= 'Z');

    }

    public static boolean isDigit(char caracter) {
        return (caracter >= '0' && caracter <= '9');


    }
}