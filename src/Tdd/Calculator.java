package Tdd;

import java.time.LocalDate;

public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }


    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(int numerator, int denominator) {
        if (denominator == 0) {
            return 0;
        }
        return numerator / (denominator * 1.0);
    }


    public int subtract(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber - secondNumber;

        }
        return secondNumber - firstNumber;
    }

   // public int calculateAgeFrom(LocalDate dateOfBirth){

       // return period.between(dateOfBirth, LocalDate.now()).getYears();
    }

   // public String bossMethod(){
      //  System.out.println("Boss method attempted to call workerOne");
      //  String beansBoughtFromWorkOne
       // return workerOne();
    


