package tema5_cursul7;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        System.out.println("introdu parola");
        Scanner input = new Scanner(System.in);
        String parolaData = input.nextLine();
        if (verificareparola(parolaData)) {
            System.out.println("\n parola este corecta " + parolaData);

        } else System.out.println("parola este incorecta");


    }

    public static boolean verificareparola(String passIntrodusa) {
        if (passIntrodusa.length() < 12) {
            return false;
        }
        int charCounter = 0;
        int numCounter = 0;
        for (int i = 0; i < passIntrodusa.length(); i++) {
            char caracter = passIntrodusa.charAt(i);
            if (isLetter(caracter))
                charCounter++;
            if (isNumeric(caracter))
                numCounter++;
        }
        return (charCounter >= 3 && numCounter >= 3);
    }


    public static boolean isLetter(char caracter) { //metoda sa verificam daca este litera
        caracter = Character.toUpperCase(caracter);
        return (caracter >= 'A' && caracter <= 'Z');

    }

    public static boolean isNumeric(char caracter) { // metoda sa verificam daca este cifra
        return (caracter >= '0' && caracter <= '9');
    }
}