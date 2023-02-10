package Practice;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamPractice {
    public static void main(String[] args) {
        //stream
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(31);
        nums.add(41);
        //imperative programming is - a paradigm describing HOW the program should
        //do something by explicitly specifying each instruction (or statement)
        //step by step, which mutate program's state.
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
//            Stream<Integer> stream = nums.stream();
//            Predicate<Integer> predicate = (t-> t % 2 == 0);
//            System.out.println(nums.stream().filter(predicate).toList());

        System.out.println(nums.stream().filter(t -> t % 2 == 0).toList());
        System.out.println(nums.stream().filter(t -> t % 2 == 1).toList());

        for (Integer num : nums) {
            System.out.println("Number: " + num);
        }
        // 1st way:
        Consumer<Integer> consumer = (t -> System.out.println("Consumer: " + t));
        nums.stream().forEach(consumer);

        // 2nd way:
        nums.stream().forEach(t -> System.out.println("Consumer: " + t));

        //Declarative programming is - a paradigm describing WHAT the program does, without explicitly
        // specifying it's control flow. Stream supports declarative programming.

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        List<Integer> nums2 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        nums2.add(15);
        nums2.add(25);
        nums2.add(35);
        nums2.add(124);
        nums2.add(432);
        nums2.add(1);
        nums2.add(15);

        System.out.println("Imperative programming: ");
        int counter = 0;
        int limit   = 3;
        for (Integer integer : nums2) {
            if( integer % 2 == 0 ){
                counter++;
                result.add(integer);
                if (counter == 3){
                    break;
                }
            }
        }
        System.out.println(result);
        System.out.println("Declarative programming: ");
        List<Integer> result2 = nums2
                .stream()
                .filter( t -> t % 2 == 0)
                .limit(3)
                .toList();
        System.out.println(result2);

        Optional<Integer> box = nums2.stream().filter( t -> t == 15).findFirst();

        if (box.isEmpty()) {
            System.out.println("Box is emty");
        }else {
            System.out.println(box.get());
        }}}

