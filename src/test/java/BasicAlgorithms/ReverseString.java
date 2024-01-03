package examplesAlgorithmsInterview;

public class ReverseString {

    public static void main(String[] args) {
        // Using traditional approach
        String chain="Hola a todos";
        String result ="";
        for(int i=chain.length()-1; i>=0; i--) {
             result = result + chain.charAt(i);
        }
        System.out.println(result);

        // Using StringBuffer class
        StringBuffer buffer = new StringBuffer(chain);
        System.out.println(buffer.reverse());
    }
}
