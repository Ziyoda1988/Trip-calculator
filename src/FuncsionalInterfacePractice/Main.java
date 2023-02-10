package FuncsionalInterfacePractice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(33);
        nums.add(555);
        nums.add(66);
        System.out.println(nums); // output- [1, 33, 555, 66]

        Collections.sort(nums);
        System.out.println(nums); //output- [1, 33, 66, 555]



        Comparator<Integer> comparator = new Comparator<Integer>() {    //We can create an anonymous object with help Comparator funk.interface.
            @Override  // override happening automatic with Comparator
            public int compare(Integer num1, Integer num2) {
                   //   return num1 - num2;  // sorts in Ascending(smallest to largest /and  A to Z
                 return num2 - num1; // sorts in Descending(largest to smallest / and Z to A
            }
        };


         Collections.sort(nums, comparator);
         System.out.println(nums);
    }}
