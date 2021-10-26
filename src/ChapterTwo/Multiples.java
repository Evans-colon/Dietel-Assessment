package ChapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("please, enter the first number: ");
        int number = input.nextInt();

        System.out.print("please, enter your second number: ");
        int secondNumber = input.nextInt();

        if (number % secondNumber == 0) {
            System.out.print("welcome bro");
        }
        else {
            System.out.print("please, keep moving");
        }
    }
}