package Classtasks;
import java.util.*;
public class MapTask2 {
    public static void main(String[] args) {


        System.out.println(wordCount("I would like to go to the park and I would like to play soccer"));//
        //{ and=1, go=1, i=2, like=2,  park=1, play=1,  soccer=1, the=1, to=3,  would=2}

        System.out.println(wordCount("I you him you them you I her her her I")); //
        //{her=3, him=1,i=3,  them=1, you=3}
    }



    public static Map<String, Integer> wordCount(String sentence){
        Map<String, Integer> map = new HashMap<>();
        String [] words = sentence.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }


}
