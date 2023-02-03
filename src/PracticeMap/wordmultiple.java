package PracticeMap;

import java.util.*;

public class wordmultiple {
    public static void main(String[] args) {


        //TESTS

        System.out.println(wordMultiple(List.of("a", "b", "a", "c", "b"))); // {a=true, b=true, c=false}
        System.out.println(wordMultiple(List.of("c", "b", "a"))); // {a=false, b=false, c=false}
        System.out.println(wordMultiple(List.of("c", "c", "c", "c"))); // {c=true}

    }


    public static Map<String, Boolean> wordMultiple(List<String> words) {

        Map<String, Boolean> wordMultiple = new HashMap<>();
        for (String s : words) {
            if (wordMultiple.containsKey(s)) {
                wordMultiple.put(s, true);
            } else wordMultiple.put(s, false);
        }
        return wordMultiple;
    }
}
