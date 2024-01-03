package examplesAlgorithmsInterview;

public class FibonacciSeries2 {
      /*
    In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.

    There are two ways to write the fibonacci series program in java:

    Fibonacci Series  USING RECURSION

     */

     static int n1 =0 ;
     static int n2 =1 ;
     static int n3 ;

    public static void main(String[] args){
        int count =10 ;
        System.out.println(n1);
        System.out.println(n2);
        printFibonacci(count-2);
   }

     static  void printFibonacci(int count){
         if(count>0){
             n3 = n1 +n2;
             n1= n2;
             n2 = n3;
             System.out.println(n3);
             printFibonacci(count-1);
         }

     }

}
