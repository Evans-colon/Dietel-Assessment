package PersonalPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("please, enter a string: ");
        String userPalindrome = userInput.nextLine();

        int low = 0;
        int high = userPalindrome.length() - 1;

        boolean isPalindrome = true;

        while (low < high) {
            if (userPalindrome.charAt(low) != userPalindrome.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        if (isPalindrome)
            System.out.println("this is a palindrome");
        else
            System.out.print("this is not a palindrome");


    }

}




