package PersonalPractice;

import java.util.Scanner;

public class CustomerSupportSwitch {
    public static void main(String[] args){


    System.out.println("press 1 for igbo");
    System.out.println("press 2 for yoruba");
    System.out.println("press 3 for hausa");
    System.out.println("press 4 for English");

        Scanner UserInputCollector = new Scanner(System.in);
        int userInput = UserInputCollector.nextInt();

        switch (userInput){
            case 1:
                System.out.println("igbo kwenu");
                break;
            case 2:
                System.out.println("Aboki");
                break;
            case 3:
                System.out.println("e kaabo");
                break;
            case 4:
                System.out.println("hello world");
                 break;
            default:
                System.out.println("chairman, what's up na?");


        }

    }
}


