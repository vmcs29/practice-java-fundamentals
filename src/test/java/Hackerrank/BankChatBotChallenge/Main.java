package Hackerrank.BankChatBotChallenge;
import java.io.*;
import java.util.*;

interface IBankAccountOperation {
    void deposit(double d);
    void withdraw(double d);
    double processOperation(String message);
}

class BankOperations implements IBankAccountOperation {

    double balance ;
    double y ;

    public void deposit(double newDeposit){
        balance = balance + newDeposit;

    }

    public void withdraw(double newWithdraw){
        balance = balance - newWithdraw;

    }

    public double processOperation(String message){

        return balance;
    }

}


//Create the BankOperations class by implementing the IBankAccountOperation interface
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        List<String> inputs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputs.add(br.readLine());
        }
        BankOperations opt = new BankOperations();
        for (String item : inputs) {
            pw.println((int)opt.processOperation(item));
        }
        pw.flush();
        pw.close();
    }
}