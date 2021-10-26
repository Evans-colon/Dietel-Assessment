package Tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void startAllTestWith() {
        calculator = new Calculator();

    }


    @Test
    void addTwoNumbersTest() {

        //given
        Calculator calculator = new Calculator();


        //assert
        assertEquals(5, calculator.add(3, 2));

    }

    @Test
    void twoNumbersCanBeMultipliedTest() {

        //given
        Calculator calculator = new Calculator();

        //assert
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    @DisplayName("Testing for division")
    void divideTwoNumbersTest() {

        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(3, calculator.divide(18, 6));

    }

    @Test
    @DisplayName("Testing for division")
    void divideByZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.divide(5, 0));

    }

    @Test
    void difference_canBeCalculated() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void calculatorCanCalculate() {
        LocalDate bessieDob = LocalDate.of(2018, 5, 8);
        System.out.println("Bessie's age is  ");
    }

    






}
