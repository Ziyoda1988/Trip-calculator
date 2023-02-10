package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(29);
        nums.add(30);
        nums.add(33);
        nums.add(1);
        // 1st way
        //Collections.sort(nums);
        //System.out.println(nums);

        //asc order
        // nums.stream().sorted().forEach((t)-> System.out.println(t));

         //desc order
        nums.stream().sorted(Comparator.reverseOrder()).forEach((t)-> System.out.println(t));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Salom",25)); //variablega saqlamasdan object yasash
        students.add(new Student("Alik", 35));
        students.add(new Student("Hayr", 41));

//        students.stream().sorted(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o2.age-o1.age; //desc order
//            }
//        }).forEach((student -> System.out.println(student)));


        //2nd way
        students.stream().sorted((s1, s2) -> s1.age - s2.age).forEach((student -> System.out.println(student)));

    }
}
