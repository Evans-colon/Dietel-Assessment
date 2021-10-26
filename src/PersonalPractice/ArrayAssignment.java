//package PersonalPractice;
//
//import java.util.Scanner;
//
//public class ArrayAssignment {
//    public static void main(String[] args) {
//        int[][] ArrayAssignment = {{2, 3, 4, 5},{8, 6, 8, 4}, {7, 9, 2, 1}};
//
//        for(int row = 0; row < ArrayAssignment.length; row++) {
//         for(int column = 0; column< ArrayAssignment[row].length; column++) {
//             System.out.print(ArrayAssignment[row][column]+ " ");
//         }
//            System.out.println();
//        }
//
//    }
//
//
//    public static class grades{
//        public static void main(String[] args) {
//            int[] grades = {2, 3, 6, 9, 4, 8, 1};
//            int sum = 0;
//            for (int grade: grades) {
//                sum += grade;
//        }
//            System.out.println("the sum of the grades is: "+ sum);
//    }
//    }
//
//
//
//    public static class practice{
//        public static void main(String[] args) {
//
//            int[] elementsInAnArray = new int[9];
//            System.out.printf("%s%8s%n", "index", "value");
//
//            int counter;
//            for (counter = 0; counter < elementsInAnArray.length; counter++)
//            elementsInAnArray[counter] = 3 * 2 * counter;
//            System.out.printf("%5d%8d%n",counter, elementsInAnArray[counter]);
//        }
//    }
//
//
//    public static class newPractice{
//        public static void main(String[] args){
//
//            int[] newPractice = {24, 9, 16, 5, 21, 15, 87};
//
//            int total = 0;
//            for(int counter = 0; counter < newPractice.length; counter++)
//                total += newPractice[counter];
//            System.out.println(total);
//        }
//    }
//}
//
//
//    public  class AnalyzeNumbers {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//
//            System.out.println("please, enter your number of items:");
//            double numberOfInput = input.nextDouble();
//            double[] arithmetic = new double [(int) numberOfInput];
//            double sum = 0;
//
//            System.out.println("enter the numbers:");
//            for( int counter = 0; counter < numberOfInput; counter++);
//            arithmetic[counter] = input.nextDouble();
//            sum = sum + arithmetic[counter];
//        }
//
//        double average = sum/numberOfInput;
//    }