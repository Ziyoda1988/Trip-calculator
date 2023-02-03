package Practice;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Salom",25)); //variablega saqlamasdan object yasash
        students.add(new Student("Alik", 35));
        students.add(new Student("Hayr", 41));

        List<String>names=new ArrayList<>();
        for (Student student : students) {
            names.add(student.name);
        }
        System.out.println(names);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

       students.stream().map(t->t.name).toList().forEach(t-> System.out.println(t)); //map() namelarni ajratib berdi


    }
}
