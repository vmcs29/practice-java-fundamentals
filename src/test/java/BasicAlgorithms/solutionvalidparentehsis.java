package BasicAlgorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class solutionvalidparentehsis {

   public static boolean isValid(String s) {
        HashMap<Character,Character> mappings = new HashMap<Character,Character>();

            mappings.put(')', '(');
            mappings.put('}', '{');
            mappings.put(']', '[');


        Stack<Character> letters = new Stack<>();
    
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(mappings.containsKey(temp)){
                if(letters.isEmpty() || letters.pop() != mappings.get(temp)){
                    return false;
                }
            } else{
                letters.push(temp);
            }
        }
        return letters.isEmpty();
    }

    public static void main(String[] args){
      
      System.out.println(isValid("()"));
      System.out.println(isValid("()"));
      System.out.println(isValid("("));
      System.out.println(isValid(""));
      System.out.println(isValid("(]"));
    }


}