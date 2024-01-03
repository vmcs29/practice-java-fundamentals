package BasicAlgorithms;

import java.util.*;

public class PositionOfAString {
    /**
     *Create a method that given a String as an input, it returns a structure containing all the characters present in it
     * along with the positions they appear in.
     *  For example: Input = “HelloWorld”
     *  Output = H : [0], e : [1], l : [2, 3, 8], o : [4, 6], W : [5], r : [7], d : [9]
     *
     */

    public static void main(String[] args) {

        String example = "Hello World";

        LinkedHashMap<Character, List<Integer>> map = new LinkedHashMap<>();

        for (int i = 0; i < example.length(); i++) {
            char current = example.charAt(i);
            if (map.containsKey(current)) {
                map.get(current).add(i);
            } else {
                map.put(current, new ArrayList<Integer>());
                map.get(current).add(i);
            }
        }

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue()+ ", " );
        }

    }
}
