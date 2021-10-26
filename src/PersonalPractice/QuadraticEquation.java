package PersonalPractice;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("please, enter the value of a: ");
        int valueOfA = userInput.nextInt();

        System.out.println("please, enter the value of b: ");
        int valueOfB = userInput.nextInt();

        System.out.println("please, enter the value of c: ");
        int valueOfC = userInput.nextInt();

        int result = (int) (-valueOfB + Math.sqrt(valueOfB * valueOfB - 4 * valueOfA * valueOfC) / (2 * valueOfA));

       System.out.println("The result of your quadratic equation is "+ result);
    }
}

