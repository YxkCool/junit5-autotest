package com.testcase;

import com.util.Calculator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/**
 * @author Kayenee
 * @Date: 2020/11/11 10:57
 * @since 1.0
 */
public class CalculatorTest2_1_parallel{

    @RepeatedTest(10)
    public void testChildMethod01() throws InterruptedException {
        int result = Calculator.count(10);
        System.out.println(result);
        System.out.println("testMethod01 Child执行");

        Thread.sleep(1*1000);
    }



}
