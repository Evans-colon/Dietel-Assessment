package Tdd;

public class Account {
    double balance;
    private int pin;

    public void depositMoney(double amount) {
        if (amount >= 0) {
            balance = balance + amount;
        }
    }

    public double getAccountBalance() {
        return balance;


    }

    public void withdrawMoney(double toWithdraw, int pin) {
        if (1234 == pin) {
            double amountToWithdraw = 0;
            balance = balance - amountToWithdraw;
        }
    }

        public void setPin ( int newPin){
            pin = newPin;

        }
    }

