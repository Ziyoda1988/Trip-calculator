package FuncsionalInterfacePractice;
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Jon", 20);
        Person person2 = new Person("Ziyoda", 34);
        Person person3 = new Person("Muslima", 7);
        Person person4 = new Person("Ali", 25);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        System.out.println(people);

//        //1st way:
//        Comparator<Person> com = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.age - o2.age;
//            }
//        };
//        Collections.sort(people, com);
//        System.out.println(people); // sorts in ascending format (older person prins first



        Comparator<Person> com2 = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int result;
                result = p1.age - p2.age;
                if(result==0){
                    result=p1.name.compareTo(p2.name);
                } return result;
            }
        };
        Collections.sort(people, com2);
        System.out.println(people);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // 2nd way
        // Collections.sort(people);
        Person p = new Person("Vali", 30);
        Person p2 = new Person("G'ani", 55);
        System.out.println(p2.compareTo(p));
    }

}
