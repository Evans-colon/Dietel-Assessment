package PersonalPractice;

import java.util.Scanner;

public class MaximumInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largestNumber = 0;
        int count = 1;
        int number = 0;

        System.out.print("please, enter series of numbers: ");
        largestNumber = input.nextInt();

        while(count <= 5){
        number = input.nextInt();

            if (number > largestNumber) {
                System.out.print("this is the largest number: "+ number);
            }
            else
            System.out.print("this is the smallest number: "+ number);
            }
    }
}
