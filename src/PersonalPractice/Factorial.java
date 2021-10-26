package PersonalPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please, enter your preferred number: ");
        int number = input.nextInt();

        int count = 1;
        int fact = 1;


        while (count <= number) {
            fact = fact * count;
            count++;
        }
            System.out.printf("here is your result: %d%n", fact);

        }
    }
