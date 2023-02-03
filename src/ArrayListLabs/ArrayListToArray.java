package ArrayListLabs;

import java.util.*;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Orange", "Banana"));

        String[] array = list2Array(arrayList);
       for (String arr : array) {
           System.out.println(arr);
       }
    }
    public static String[] list2Array(List<String> stringList) {

        String[] listArray = stringList.toArray(new String[stringList.size()]);

        return listArray;}

        }
