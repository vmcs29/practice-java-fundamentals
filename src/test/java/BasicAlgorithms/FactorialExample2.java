package examplesAlgorithmsInterview;

public class FactorialExample2 {
    static int factorial(int n){
        if (n == 0) {
            return 1;
        }
        else
            return(n * factorial(n-1));
    }
    public static void main(String args[]){
        int i;
        int fact;
        int number=4;//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
