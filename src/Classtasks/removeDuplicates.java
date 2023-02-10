package Classtasks;
import java.util.*;
public class removeDuplicates {


        public static void main(String[] args) {

            List<Character> list = new ArrayList<>();

            list.add('a');
            list.add('a');
            list.add('a');
            list.add('b');
            list.add('c');
            list.add('c');
            list.add('c');
            list.add('d');
            list.add('d');
            list.add('d');
            list.add('a');


            removeDuplicates(list);
            System.out.println(list);  //   [a, b, c, d]

        }

        public static void removeDuplicates(List<Character> list){

            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) {
                        list.remove(j);
                        j--;
                    }
                }
            }
        }
    }
