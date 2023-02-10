package Classtasks;


import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("java");
        list.add("hello");
        list.add("hi");
        list.add("phone");

        ArrayList<String> updatedList = changePigLatin(list);

        System.out.println(updatedList);
    }
    // Create the method here

    // Create a method that accepts an ArrayList<String>  and processes the ArrayList so that each String in
    // that arraylist is pig latined (move the first letter to the end and add "ay")
    // and returns the ArrayList
    //  {"java", "hello", "hi", "phone"} -> {"avajay", "ellohay", "ihay", "honepay"}
    public static ArrayList<String> changePigLatin(ArrayList<String> list) {

        ArrayList<String> updatedList = new ArrayList<>();
        for (String each : list) {
            String firstletter = each.substring(0, 1);
            String rest = each.substring(1);
            String piglatin = rest + firstletter + "ay";
            updatedList.add(piglatin);
        }

        return updatedList;
    }


}

