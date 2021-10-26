package PersonalPractice;

import java.util.Scanner;

public class CalculateFutureInvestmentPlan {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        System.out.println("please, enter your investment amount: ");
        double investmentAmount = userInput.nextInt();

        System.out.println("please, enter the annual rate: ");
        int annualRate = userInput.nextInt();

        System.out.println("please, enter the number of years: ");
        int numberOfYears = userInput.nextInt();

        double monthlyInterestRate = annualRate / 1200;

        double futureInvestmentValue = (investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        System.out.println("the future investment values is: "+ futureInvestmentValue);
    }
}
