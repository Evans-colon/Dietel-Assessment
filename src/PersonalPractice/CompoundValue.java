package PersonalPractice;

import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("please, enter your monthly savings: ");
        int monthlySavings = userInput.nextInt();

        double monthlyRate = 0.05/12;

        double secondMonth = monthlyRate * (1 + 0.00417);

        double thirdMonth = monthlyRate + secondMonth;

    }
}
