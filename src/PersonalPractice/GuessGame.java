package PersonalPractice;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("please, guess number");
        int number = userInput.nextInt();

        int counter = 0;
        while (number != 25){
        if (number != 25) {
            System.out.print("try again, you can do better");

            number = userInput.nextInt();
            }
        else {

            if (number == 25)
                break;
        }


    }
        System.out.println("congratulations");
    }
}

