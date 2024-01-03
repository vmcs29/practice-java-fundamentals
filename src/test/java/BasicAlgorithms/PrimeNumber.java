package examplesAlgorithmsInterview;

import java.util.Scanner;

public class PrimeNumber {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String args[]){
        int i;
        int m;
        int flag=0;

        int n=16;//it is the number to be checked if we want to hardcode our entry

        /*
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        */
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }

}
