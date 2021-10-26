package PersonalPractice;

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("               multiplication table");

        System.out.print("    ");
        for(int numberTitle = 1; numberTitle <= 9; numberTitle++)
            System.out.print("   " + numberTitle);

            System.out.println("\n-----------------------------------------");


            for(int body = 1; body <= 9; body++){
                System.out.print(body + " | ");

                for(int product = 1; product <= 9; product++){
                    System.out.printf("%4d", body * product);
                }
                System.out.println();
            }
        }

    }

