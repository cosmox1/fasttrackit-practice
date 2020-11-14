package tema4_cursul6;

import javax.print.DocFlavor;

public class Homework2 {


    // metoda cu int
    static void printAnything(int x) {
        System.out.println("int primitiva" + x);

    }

    //metoda cu long
    static void printAnything(long x) {
        System.out.println("long primitiva" + x);
    }
// metoda cu Long wrapper

    static void printAnything(Long x) {
        System.out.println("Wrapper Long" + x);
    }

    // metoda cu String
    static void printAnything(String a) {
        System.out.println("String " + a);
    }

    // metoda cu Double
    static void printAnything(Double x) {
        System.out.println("Double wrapper" + x);
    }
// metoda cu obiect

    static void printAnything(ClasaPtObiect obiectlamisto) {
        System.out.println("obiectul +" + obiectlamisto);
    }


// metoda cu lista int

    static void printAnything(int[] intArray) {
        System.out.println("int[] :" + intArray[0]);
    }

    // metoda cu lista long
    static void printAnything(long[] longArray) {
        System.out.println("long[] : " + longArray.length);
    }

    public static void main(String[] args) {
        //variabile
        int numarIntPrimitiva = 20;
        long numarLongPrimitiva = 300;
        Long numarLongWrapper = Long.valueOf(999999);
        String TemaFacutaTarziu = "tema Tarziu facuta";
        Double numarWrapperDouble = Double.valueOf(421421);
        int[] listaDeInteger = new int[3];
        long[] listaDeLong = new long[2];
        //obiect
        ClasaPtObiect obiectulCreat = new ClasaPtObiect("Daniel", 11);
        // adaugam in lista


        listaDeInteger[0] = 1;
        listaDeInteger[1] = 2;
        listaDeInteger[2] = 3;
        listaDeLong[0] = 4;
        listaDeLong[1] = 5;

        printAnything(listaDeLong);
        printAnything(listaDeInteger);
        printAnything(obiectulCreat);
        printAnything(numarWrapperDouble);
        printAnything(TemaFacutaTarziu);
        printAnything(numarLongWrapper);
        printAnything(numarLongPrimitiva);
        printAnything(numarIntPrimitiva);
    }
}

// la int nu inteleg de ce imi da "int[] :[I@12edcd21" ci nu numerele din lista