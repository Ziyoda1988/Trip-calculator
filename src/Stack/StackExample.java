package Stack;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {


        System.out.println(reverse("hello")); // "olleh"
    }

    /*
     * Reverse the given string using Stack data structure.
     * Stack uses LIFO order, you can use it to add and then retrieve items from the stack in reverse order.*/
    public static String reverse(String str) {
        char[] char1 = new char[str.length()];

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        int i = 0;
        while (!stack.isEmpty()) {
            char1[i] = stack.pop();
            i++;
        }
        return new String(char1);
    }
}


// Implement using Stack because it is LIFO type data structure





