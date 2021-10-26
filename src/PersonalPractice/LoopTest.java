package PersonalPractice;

import java.util.Arrays;
import java.util.Scanner;

public class LoopTest {
    public static void main(String[] args) {
//        int number = 1;
//        while (number <= 10) {
//            System.out.println("The current number is " + number);
//            number++;
//        }
//        System.out.println("Out of the loop");

//        boolean userIsUsingTheAtm = true;
//        Scanner scanner = new Scanner(System.in);
//        while (userIsUsingTheAtm) {
//            System.out.println("Are you still using the atm? ");
//            int choice = scanner.nextInt();
//            switch (choice) {
//                case 1 -> userIsUsingTheAtm = false;
//                case 2 -> System.out.println("Hello");
//                case 3 -> System.out.println("Hey");
//                default -> System.out.println("Default");
//            }
//        }
//        System.out.println("Bye Bye!");

        int[] numbers = new int[10];
        numbers[0] = 5;
        numbers[1] = 7;
        numbers[5] = 10;
        numbers[9] = 23;

        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {1, 2, 3, 5, 6};
        System.out.println(Arrays.toString(numbers2));

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
