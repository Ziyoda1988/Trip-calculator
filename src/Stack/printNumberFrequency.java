package Stack;

import java.util.*;

public class printNumberFrequency {
    public static void main(String[] args) {


        printNumberFrequency("1 5 9 2 1 5 8 1");  // 1(3) 2(1) 5(2) 8(1) 9(1)
        printNumberFrequency("1 1 1 1 1 1 1 2 3 3 3 3 0");  // 1(7) 2(1) 3(4) 0(1)

    }
    public static void printNumberFrequency(String str) {
        String[] arr = str.split(" ");
        int[] arrInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arrInt);
        int count = 1;
        for (int i = 0; i < arrInt.length; i++) {
            if (i == arrInt.length - 1) {
                System.out.print(arrInt[i] + "(" + count + ")");
                break;
            }
            if (arrInt[i] == arrInt[i + 1]) {
                count++;
            } else {
                System.out.print(arrInt[i] + "(" + count + ") ");
                count = 1;
            }
        }


    }

}


  /*Write a method which takes in a space-separated string of integers,
   and prints out the number of occurrences of each integer.
    (The order of the pairs do not matter)
    example;    Input: "1 5 9 2 1 5 8 1"
                Output: "1(3) 2(1) 5(2) 8(1) 9(1)"

        */