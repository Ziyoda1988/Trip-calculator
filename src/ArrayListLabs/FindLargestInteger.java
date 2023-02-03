package ArrayListLabs;
import java.util.*;
public class FindLargestInteger {

    public static void main(String[] args) {

        List <Integer> integerList=new ArrayList<>(Arrays.asList(11, 200, 43, 84, 9917, 4321, 1, 33333, 8997));
        System.out.println(findLargest(integerList));

    }


    public static Integer findLargest(List<Integer> integerList) {
        int largest = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > largest) {
                largest = integerList.get(i);
            }
        }
        return largest;
    }}