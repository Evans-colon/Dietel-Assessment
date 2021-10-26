package ChapterTwo;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number = 0;
        double circumference;
        double diameter;
        double area;

        System.out.print("please, enter number: ");
        number = input.nextDouble();

        circumference = 2 * 3.142 * number;
        System.out.println("Circumference is "+ circumference);

        diameter = 2 * number;
        System.out.println("Diameter is "+ diameter);

        area = 3.142 * number * number;
        System.out.println("Area is "+ area);














    }
}
