package PersonalPractice;

import java.util.Scanner;

public class SumOfDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("please, enter number between 1 and 1000: ");
        int digit = userInput.nextInt();


        int firstProcess =  digit % 10;
        int remaining = digit / 10;

        int secondProcess = remaining % 10;

        int thirdProcess = remaining / 10;

        int result = firstProcess + secondProcess + thirdProcess;

        System.out.println("the sum of the digits: "+result);


    }

}
