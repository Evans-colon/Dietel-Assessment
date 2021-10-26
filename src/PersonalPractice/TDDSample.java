package PersonalPractice;

public class TDDSample {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount && amount > 0)
            balance -= amount;
    }
}
