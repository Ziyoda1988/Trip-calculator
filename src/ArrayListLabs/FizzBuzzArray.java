package ArrayListLabs;

import java.util.*;

public class FizzBuzzArray {
    public static void main(String[] args) {

            Integer integerList[] = { 7, 8, 9, 10 ,11,12,13,14,15};

            List<String> stringList = fizzBuzzList(integerList);

            System.out.println(stringList);


        }



    public static List<String> fizzBuzzList(Integer[] integerArray) {

        List<String> newFizz = new ArrayList<String>();

        for(int i = 0; i < integerArray.length; i++) {
            if((integerArray[i] % 3 == 0) && (integerArray[i] % 5 == 0)) {
                newFizz.add("FizzBuzz");
            }else if(integerArray[i] % 3 == 0) {
                newFizz.add("Fizz");
            }else if(integerArray[i] % 5 == 0) {
                newFizz.add("Buzz");
            }else {
                newFizz.add(integerArray[i].toString());
            }

        }
        return newFizz;
    }


}



