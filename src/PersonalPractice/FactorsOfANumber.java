package PersonalPractice;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("please, enter you preferred number: ");
        int userInput = input.nextInt();

        int counter = 1;


        while (counter <= userInput) {

            if (userInput % counter == 0){
                System.out.println(counter);
            }

            counter++;

            }
        }


    }



