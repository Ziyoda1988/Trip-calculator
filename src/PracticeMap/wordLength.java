package PracticeMap;
import java.util.*;
public class wordLength {
    public static void main(String[] args) {
        //TESTS
        System.out.println(wordLen(List.of("a", "bb", "a", "bb")));  // {bb=2, a=1}
        System.out.println(wordLen(List.of("this", "and", "that", "and"))); //  {that=4, and=3, this=4}
        System.out.println(wordLen(List.of("code", "code", "code", "bug"))); // {code=4, bug=3}


    }


    public static Map<String, Integer> wordLen(List<String> words){
        Map<String,Integer> wordLen = new HashMap<>();
        for (String s : words) {
            wordLen.put(s,s.length());


        }

        return wordLen;
    }
}
  /*Given a List of strings, return a Map<String, Integer> containing a key for every unique string in the array,
  and the value as string's length.

       wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
       wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
       wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}*/
