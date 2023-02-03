package FuncsionalInterfacePractice;
import java.util.*;
public class ComparatorPractice {
    public static void main(String[] args) {
 List<Integer> nums = new ArrayList<>();
 nums.add(4);
 nums.add(3);
 nums.add(10);
 nums.add(5);

        System.out.println(nums); // before sorting

        Comparator <Integer> comparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1 - num2; // sorts in ascending order (smallest to largest
            }//return num2 - num1; // sorts in descending order (largest to smallest
        }; Collections.sort(nums, comparator);
        System.out.println(nums); // after sorting
    }
}
