package Classtasks;

public class RemoveDuplicates2 {
    public static void main(String[] args) {


        //Test your method here

        System.out.println(removeDuplicates("abaaabbbbacaaafbbbbaccchhh")); // "abcfh"
        System.out.println(removeDuplicates("dhbshfsdkkfsdjhjf")); //"dhbsfkj"

    }


    public static String removeDuplicates(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i) + "")) {
                result += str.charAt(i);
            }
        }


        return result;
    }
}
  //  Given s String, return the String with duplicate chars removed

