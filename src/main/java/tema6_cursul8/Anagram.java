package tema6_cursul8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String x = in.nextLine();
        if (Verificare(s, x))
            System.out.println("sunt anagrame " + s + " - " + x);
        else
            System.out.println("nu sunt anagrame o conditie nu e indeplinita");

    }


    public static boolean Verificare(String s1, String s2) throws Exception {
        char[] arr = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int numberOfCharsString1 = arr.length;
        int numbString2 = arr2.length;
        if (numberOfCharsString1 != numbString2) {
            throw new Exception("cele doua stringuri au numere de caractere inegale");

        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for (int i = 0; i < numberOfCharsString1; i++) {
            if (arr[i] != arr2[i])
                throw new Exception(" nu sunt anagrame");


        }
        return true;
    }
}
