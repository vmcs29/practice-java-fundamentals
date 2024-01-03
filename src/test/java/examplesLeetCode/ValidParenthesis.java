package examplesLeetCode;

import java.util.HashMap;
import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 */
public class ValidParenthesis {

    public static void valid_paren(String s) {
        // Declaring a stack
        Stack<Character> stk = new Stack<>();
        // Iterating over the entire string.
        for (char st : s.toCharArray()) {
            //  If the input string contains an opening parenthesis,
            //  push in on to the stack.
            if (st == '(' || st == '{' || st == '[') {
                stk.push(st);
            }
            else {
                // In the case of valid parentheses, the stack cannot be
                // be empty if a closing parenthesis is encountered.
                if(stk.empty()) {
                    System.out.println(s +
                            " contains invalid parentheses.");
                    return;
                } else{
                    // If the input string contains a closing bracket,
                    // then pop the corresponding opening parenthesis if
                    // present.
                    char top = stk.peek();
                    if(st == ')' && top == '(' ||
                            st == '}' && top == '{' ||
                            st == ']' && top == '['){
                        stk.pop();
                    }
                    else{
                        System.out.println(s +
                                " contains invalid parentheses.");
                        return;
                    }
                }
            }
        }
        //  Checking the status of the stack to determine the
        //  validity of the string.
        if(stk.empty()) {
            System.out.println(s +
                    " contains valid parentheses.");
        }
        else{
            System.out.println(s +
                    " contains invalid parentheses.");
        }
    }
    public static void main(String[] args) {
        String input_str1 = "()";
        String input_str2 = "()[]{}";
        String input_str3 = "(]";
        valid_paren(input_str1);
        valid_paren(input_str2);
        valid_paren(input_str3);
    }
}
