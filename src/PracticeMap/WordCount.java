package PracticeMap;
import java.util.*;
public class WordCount {
    public static void main(String[] args) {
        //TESTS

        System.out.println(wordCount(List.of("a", "b", "a", "c", "b")));  // {a=2, b=2, c=1}
        System.out.println(wordCount(List.of("c", "b", "a"))); //  {a=1, b=1, c=1}
        System.out.println(wordCount(List.of("c", "c", "c", "c"))); // {c=4}

    }
    public static Map<String, Integer> wordCount(List<String> list){
        Map<String, Integer> wordCount = new HashMap<>();
        for (String s : list){
            String tmp = s;
            if ( wordCount.containsKey(tmp) ) {
                int count = wordCount.get(tmp);
                wordCount.put(tmp, count + 1);
            } else wordCount.put(tmp,1);
            }


        return wordCount;
    }
}
/*GThe classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each
different string, with the value the number of times that string appears in the array.


wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}*/