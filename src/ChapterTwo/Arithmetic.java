package ChapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int sum;
        int average;
        int product;

        System.out.print("please, enter the first number: ");
        firstNumber = input.nextInt();

        System.out.print("please, enter the second number: ");
        secondNumber = input.nextInt();

        System.out.print("please, enter the third number: ");
        thirdNumber = input.nextInt();

        sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("The sum is: "+ sum);

        average = sum / 3;
        System.out.println("the average is: "+ average);

        product = firstNumber * secondNumber * thirdNumber;
        System.out.println("the product is: "+ product);

        }


    }

