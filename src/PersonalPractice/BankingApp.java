package PersonalPractice;

import java.util.Scanner;

public class BankingApp {

    private int balance;
    int deposit;
    int withdrawal;

    public BankingApp(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(){
        this.balance = balance;
    }

    public void withdrawal(){
        if (balance < withdrawal)
            balance = balance - withdrawal;

    }

    public void deposit() {
        if (balance > 0) {
            balance = balance + deposit;
        }

    }
}


    //Scanner userInputCollector = new Scanner(System.in);
    //int userInput = userInputCollector.nextInt();






