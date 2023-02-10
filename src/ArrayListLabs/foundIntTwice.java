package ArrayListLabs;

import java.util.*;

public class foundIntTwice {
    public static void main(String[] args) {
        //Test your method here
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 5, 1));

        System.out.println(foundIntTwice(list, 5));
        System.out.println(foundIntTwice(list, 8));
        System.out.println(foundIntTwice(list, 1));
    }

    public static boolean foundIntTwice(List<Integer> integerList, int intToFind) {
        int counter = 0;

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) == intToFind) {
                counter++;
                if (counter >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}