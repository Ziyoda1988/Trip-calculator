package PracticeMap;
import java.util.*;
public class pairs {
    public static void main(String[] args) {
        //TESTS

        System.out.println(pairs(new String[]{ "code", "bug"})); //  {b=g, c=e}
        System.out.println(pairs(new String[]{"man", "moon", "main"}));//  {m=n}
        System.out.println(pairs(new String[]{"a", "b"})); // {a=a, b=b}
        System.out.println(pairs(new String[]{"man", "moon", "good", "night"})); // {g=d, m=n, n=t}
    }


    public static Map<Character, Character>  pairs(String[]strings){
        Map<Character, Character> pairs = new HashMap<>();
        for (int i = 0; i<strings.length; i++){
            pairs.put (strings[i].charAt(0), strings[i].charAt(strings[i].length()-1));
        }
        return pairs;
    }
}
  /*Given a List of non-empty strings, create and return a Map<String, String> as follows:
for each string add its first character as a key with its last character as the value.

pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "maij"]) → {"m": "j"}
pairs(["a", "b"]) → {"a": "a", "b": "b"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}*/

