package PracticeMap;
import java.util.*;
public class takeOver {
    public static void main(String[] args) {



        //TEST 1
        Map<String, String> map =  new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        System.out.println( takeOver(map) );  // {a=, b=candy}

        //TEST 2
        Map<String, String> map2 =  new HashMap<>();
        map2.put("a", "candy");
        System.out.println( takeOver(map2) );  // {a=, b=candy}

        //TEST 3
        Map<String, String> map3 =  new HashMap<>();
        map3.put("a", "icecream");
        map3.put("b", "carrot");
        map3.put("c", "meh");


        System.out.println( takeOver(map3));

    }
    public static Map<String, String> takeOver(Map<String, String> map) {

       map.put("b", map.get("a"));
       map.put("a", "");




        return map;

        // implement the method

    }

}
/*Modify and return the given map as follows:
if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "" (empty string).
Basically b takes over a's value and leaves a's value empty.

takeOver({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
takeOver({"a": "candy"}) → {"a": "", "b": "candy"}
takeOver({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}*/