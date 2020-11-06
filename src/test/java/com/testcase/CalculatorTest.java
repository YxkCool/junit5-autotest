package com.testcase;

import com.util.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author Kayenee
 * @Date: 2020/11/6 18:34
 * @since 1.0
 */
public class CalculatorTest1-1 {


    @Test
    public void addTest() {

        assertEquals(3, Calculator.add(1, 2));


    }

    @Test
    public void countTest() {
        assertEquals(3, Calculator.count(5), "不符合预期");

    }

    @Test
    public void subtractTest() {
        assertEquals(3, Calculator.subtract(5, 10), "不符合预期");

    }

    @Test
    public void multiplyTest() {
        assertEquals(2, Calculator.multiply(1, 2));

    }

    @Test
    public void divideTest() {
        assertEquals(0, Calculator.divide(1, 2));

    }


}
