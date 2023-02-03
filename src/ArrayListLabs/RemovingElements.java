package ArrayListLabs;
import java.util.*;
public class RemovingElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
      list.add("hello");
      list.add("hi");
      list.add("que");
      list.add("paso");
      list.add("sup");

    everyOther(list);

      System.out.println(list); //[hi, paso]
}


    public static void everyOther(ArrayList<String> nums) {

        for (int i = 0; i < nums.size(); i++) {
            nums.remove(i);
        }}}



