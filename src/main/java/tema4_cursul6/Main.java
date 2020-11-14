package tema4_cursul6;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List <Assignment> Assignment = new ArrayList<>();
        Assignment cursulUnu= new Assignment(1,
                "Cursul cu numarul 1","easy", 1);
Assignment.add(cursulUnu);
Assignment cursulDoi= new Assignment(2,"Cursul cu numarul 2",
        "easy",22);
Assignment.add(cursulDoi);
Assignment cursulTrei= new Assignment(3,"Cursul cu numarul 3",
        "medium", 4);
Assignment.add(cursulTrei);
Assignment cursulPatru= new Assignment(4, "Cursul cu numarul 4",
        "hard", 36);
Assignment.add(cursulPatru);
Assignment cursulCinci = new Assignment(5 , "Cursul cu numarul 5",
        "medium", 44);
Assignment.add(cursulCinci);

        List<Integer> uniqId = Assignment
                .stream()
                .map(SingleItem -> SingleItem.getUniqueId())
                .collect(Collectors.toList());

        System.out.println("lista doar cu idiuri uncie"+ uniqId);


        List<tema4_cursul6.Assignment> filtrat = Assignment
                .stream()
                .filter(unfiltru -> unfiltru.getDificultyLevel().equals("easy") ||
                        unfiltru.getDificultyLevel().equals("medium"))
                .collect(Collectors.toList());
        System.out.println("lista filtrata dupa nivelul de dificultate"+ filtrat);

       Assignment
                .stream()
                .filter(unfiltru -> unfiltru.getDificultyLevel().equals("easy") ||
                        unfiltru.getDificultyLevel().equals("medium"))
                .peek(unfiltru-> System.out.println(unfiltru));

        Map<Integer, tema4_cursul6.Assignment> mapCollection = Assignment
                .stream()
                .collect(Collectors.toMap(tema4_cursul6.Assignment::getUniqueId, Function.identity()));

        System.out.println("map" + mapCollection.get(4));
    }

    }

