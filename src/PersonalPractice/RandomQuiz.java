package PersonalPractice;

import java.util.Scanner;

public class RandomQuiz {
    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.println("what is " + number1 + " - " + number2 + "? ");
        Scanner userInputSubtraction = new Scanner(System.in);
        int answerToSubtraction = userInputSubtraction.nextInt();


        if (number1 - number2 == answerToSubtraction) {
            System.out.println("you are correct");

        } else {
            System.out.println("your answer is wrong.");
            System.out.println("The answer is " + (number1 - number2));
         }

        }

}
