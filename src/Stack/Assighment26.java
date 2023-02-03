package Stack;

import java.util.*;

public class Assighment26 {
    public static void main(String[] args) {
        //TESTS
        System.out.println(isBalanced("()")); //- true                  "()" -> true
        System.out.println(isBalanced("((()))")); //- true              "((()))" -> true
        System.out.println(isBalanced("([[{{}}]])")); //- true          "([[{{}}]])" -> true
        System.out.println(isBalanced("()(){}{{}}[][[]]")); //- true    "()(){}{{}}[][[]]" -> true
        System.out.println(isBalanced("[{()}]")); // - true             "[{()}]" -> true
        System.out.println(isBalanced("({}{}([{}]))"));// - true        "({}{}([{}]))" -> true
        System.out.println(isBalanced("[({(})]")); // false             "[({(})]" -> false
        System.out.println(isBalanced("{[}"));//- false                 "{[}" -> false
        System.out.println(isBalanced("({")); //- false                 "({" -> false

    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                } else if (ch == ']' && top != '[') {
                    return false;
                } else if (ch == '}' && top != '{') {
                    return false;

                } else if (stack.isEmpty()) {
                    return true;
                }


            }


        }

        return false;
    }
}
/*Given a string containing only the characters ( ) { } [ ] determine if it is balanced.

The string is considered balanced if:

Open brackets are closed by the same type of brackets.
Open brackets are closed in the correct order.

Use Stack data structure for solution.




*/
