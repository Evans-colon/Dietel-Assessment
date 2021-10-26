package PersonalPractice;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentTextFile {
    private static Formatter output;
    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();



    }
    private static void openFile() {
        try{
            output = new Formatter("students_read.txt");
        }
        catch (SecurityException securityException){
            System.err.println("write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void addRecords(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ","Enter First Name, LastName, Level, year, Age.","Enter end-of-file indicator to end input");

        while (input.hasNext()){
            try{output.format("%s %s %s %s %n", input.next(), input.next(), input.next(), input.next());
            }
            catch (FormatterClosedException formatterClosedException){
                System.err.println("Error writing to file. Terminating.");
                break;
            }
            catch (NoSuchElementException elementException){
                System.err.println("Invalid input. please try again.");
                input.nextLine();
            }
            System.out.print("? ");

        }
    }
    private static void closeFile(){
        if(output != null)
            output.close();
    }

}
