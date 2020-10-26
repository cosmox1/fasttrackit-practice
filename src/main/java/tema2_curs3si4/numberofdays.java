package tema2_curs3si4;

import java.util.Scanner;

public class numberofdays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numarulDeZileInoLuna = 0;
        String nUmeleLunii = "Necunoscut";
        System.out.println("sa se scrie anul");

        int anul = input.nextInt();
        System.out.println("sa se scrie luna");
        int luna = input.nextInt();
        switch (luna) {
            case 1:
                nUmeleLunii = "Ianuarie";
                numarulDeZileInoLuna = 31;
                break;
            case 2:
                nUmeleLunii = "Februarie";
                if ((anul % 400 == 0) || ((anul % 4 == 0) && (anul % 100 != 0))) {
                    numarulDeZileInoLuna = 29;
                } else {
                    numarulDeZileInoLuna = 28;
                }
                break;
            case 3:
                nUmeleLunii = "Martie";
                numarulDeZileInoLuna = 31;
                break;
            case 4:
                nUmeleLunii = "Aprilie";
                numarulDeZileInoLuna = 30;
                break;
            case 5:
                nUmeleLunii = "Mai";
                numarulDeZileInoLuna = 31;
                break;
            case 6:
                nUmeleLunii = "Iunie";
                numarulDeZileInoLuna = 30;
                break;
            case 7:
                nUmeleLunii = "Iulie";
                numarulDeZileInoLuna = 31;
                break;
            case 8:
                nUmeleLunii = "August";
                numarulDeZileInoLuna = 31;
                break;
            case 9:
                nUmeleLunii = "Septembrie";
                numarulDeZileInoLuna = 30;
                break;
            case 10:
                nUmeleLunii = "Octombrie";
                numarulDeZileInoLuna = 31;
                break;
            case 11:
                nUmeleLunii = "Noiembrie";
                numarulDeZileInoLuna = 30;
                break;
            case 12:
                nUmeleLunii = "Decembire";
                numarulDeZileInoLuna = 31;


        }

        System.out.println(nUmeleLunii+" "+anul+" are "+ numarulDeZileInoLuna+ " zile");
    }

}
