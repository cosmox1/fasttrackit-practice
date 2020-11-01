package tema3_cursul5;

import java.util.*;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Assignment numarulUnu = new Assignment(1, "hard", "CursulCuNumarul1");
        Assignment numarulDoi = new Assignment(2, "easy", "CurusulCuNumarul2");
        Assignment numarulTrei = new Assignment(3, "medium", "CusulCuNumarul3");
        Assignment numarulPatru = new Assignment(4, "easy", "CursulCuNumarul4");
        Assignment numarulCinci = new Assignment(5, "medium", "CursulCuNumarul5");
        Comparatorul dupaNumarSiDificultate = new Comparatorul();
        Comparatoruldoi dupaNumarulDeCursSiAssigmentTitle = new Comparatoruldoi();


        TreeSet<Assignment> colectiaUnu = new TreeSet<>(dupaNumarSiDificultate);
        colectiaUnu.add(numarulUnu);
        colectiaUnu.add(numarulDoi);
        colectiaUnu.add(numarulTrei);
        colectiaUnu.add(numarulPatru);
        colectiaUnu.add(numarulCinci);
        System.out.println("comparare dupa numarul de curs si nivelul de dificultate" + colectiaUnu);

        TreeSet<Assignment> colectiaDoi = new TreeSet<>(dupaNumarulDeCursSiAssigmentTitle);
        colectiaDoi.add(numarulUnu);
        colectiaDoi.add(numarulDoi);
        colectiaDoi.add(numarulTrei);
        colectiaDoi.add(numarulPatru);
        colectiaDoi.add(numarulCinci);
        System.out.println("comparare dupa course number si assigment title" + colectiaDoi);


        HashMap<String, TreeSet<Assignment>> courseNumberPlusDificultyLevel = new HashMap<>();
        courseNumberPlusDificultyLevel.put("primul curs facut si nivel de dificultate", colectiaDoi);
        System.out.println("mapa"+courseNumberPlusDificultyLevel);
    }

}

