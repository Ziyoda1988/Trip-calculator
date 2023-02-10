package ArrayListLabs;

import java.util.*;

public class turnArrayToArrayList {
    public static void main(String[] args) {
        String [] array2List = new String[]{"Apple", "Orange", "Banana"};

        System.out.println(array2List(array2List)); // [Apple, Orange, Banana]

    }


    public static List<String> array2List(String[] stringArray) {

        return List.of(stringArray);
    }
}

