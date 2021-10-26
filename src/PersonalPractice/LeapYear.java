package PersonalPractice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("enter a year: ");
        int year = userInput.nextInt();

        boolean isALeapYear = (year % 4 == 0 && year % 100 != 100) || (year % 400 == 0);

        System.out.println(isALeapYear);

    }
}
