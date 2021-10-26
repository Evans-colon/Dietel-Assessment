package ChapterTwo;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weightInPounds;
        int heightInInches;
        int totalWeight;
        int totalHeight;
        int bmi;


        System.out.print("please, enter your weight in pounds: ");
        weightInPounds = input.nextInt();
        totalWeight = weightInPounds * 703;

        System.out.print("please, enter your height in metres: ");
        heightInInches = input.nextInt();
        totalHeight = heightInInches * heightInInches;

        bmi = totalWeight / totalHeight;

        if (bmi >= 30) {
            System.out.print("obese");
        }
        else if (bmi >= 24.9) {
            System.out.print("overweight");
        }
        else if (bmi >= 18.5) {
            System.out.print("normal");
        }
        else if(bmi < 18.5) {
            System.out.print("underweight");

        }
    }
}
