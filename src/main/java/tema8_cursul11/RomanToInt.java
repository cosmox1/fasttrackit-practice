package tema8_cursul11;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String x){
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int resultat=0;
    for (int i=0;i<x.length();i++){
        if (i>0 && map.get(x.charAt(i))>map.get(x.charAt(i-1))){
            resultat+=map.get(x.charAt(i))- 2 * map.get(x.charAt(i - 1));
        }
        else {
            resultat+=map.get(x.charAt(i));
        }
    }
    return resultat;
    }
}
