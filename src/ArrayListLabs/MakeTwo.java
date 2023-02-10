package ArrayListLabs;

import java.util.ArrayList;

public class MakeTwo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(makeTwo(list)); // [4,4,5,5,6,6]

    }


    public static ArrayList<Integer> makeTwo(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size(); i++) {
            nums.add(i, nums.get(i));
            i++;
        }

        return nums;
    }

}

