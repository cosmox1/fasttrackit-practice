package tema7_cursul10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickingNumberr {
    public static void main(String[] args) {
        //am facut citirea de la tastatura si creerea unei liste in care adaugam elemente
        System.out.println("Introdu dimensiunea array-ului");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("introdu numerele intregi din array");
        List<Integer> lista = new ArrayList<>();
        while (n > 0) {
            n--;
            lista.add(input.nextInt());
        }
        int result = pickingNumbs(lista);
        System.out.println(result);


    }

    // am creat o metoda ce returneaza un int si ia ca parametru o lista
    public static int pickingNumbs(List<Integer> oListaOarecare) {
        //am creeat 2 parametrii in metoda primul fiind un array de tip integer si un rezultat
        int frecventa[] = new int[101];
        int result = Integer.MIN_VALUE;


        for (int i = 0; i < oListaOarecare.size(); i++) {
            int index = oListaOarecare.get(i);
            frecventa[index]++;
        }
        for (int i = 1; i <= 100; i++) {
            result = Math.max(result, frecventa[i] + frecventa[i - 1]);
        }

        return result;
    }

}
