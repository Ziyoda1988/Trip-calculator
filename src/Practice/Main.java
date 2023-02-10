package Practice;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(25);
        nums.add(15);
        Stream<Integer> createStream = nums.stream(); // streamni aslida variable typega saqlash shartmas
        createStream.forEach((t) ->System.out.println(t));

           nums.stream()    //stream supports 2 types operations 1) intermediate = returns stream as a result
                   .filter((t) -> t % 2 ==0)                 //  2) terminal = returns exact value (int, String, double ...)
                   .forEach((t)-> System.out.println(t));

           List<Student> students = new ArrayList<>();
           students.add(new Student("Salom",25)); //variablega saqlamasdan object yasash
           students.add(new Student("Alik", 35));
           students.add(new Student("Hayr", 41));

           students.stream()
                   .filter((t) -> t.age>10)
                   .forEach((t)-> System.out.println(t));
        }}