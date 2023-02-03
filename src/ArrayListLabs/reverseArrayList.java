package ArrayListLabs;
import java.util.*;
public class reverseArrayList {
    public static void main(String[] args) {
        //Given a List of Strings, return a new list in reverse order of the original.

        ArrayList<String> list = new ArrayList<>(Arrays.asList("purple", "green", "blue", "yellow", "green"));
        System.out.println(reverseList(list));

        // reverseList( ["purple", "green", "blue", "yellow", "green" ])  -> ["green", "yellow", "blue", "green", "purple" ]
    }
    public static List<String> reverseList(List<String> stringList) {
        List<String> reverseList = new ArrayList<>();
        for (int i = stringList.size() - 1; i >= 0; i--) {
            reverseList.add(stringList.get(i));
        }
        return reverseList;

    }

}
