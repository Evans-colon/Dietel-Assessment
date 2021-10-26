package ChapterTwo;

import java.util.Scanner;

public class OddAndEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;


        System.out.print("Enter your preferred number: ");
        number = input.nextInt();
         if(number % 2 == 0){
             System.out.print("welcome, even number");
         }
         else
             System.out.print("Goodbye, odd number");
    }
}
