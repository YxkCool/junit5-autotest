package com.testcase;

import com.util.Calculator;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Kayenee
 * @Date: 2020/11/11 10:57
 * @since 1.0
 */
@Epic("计算器")
@Feature("加减乘除冒烟用例")
public class Junit5_1_1_Allure {
    @Test
    @Description("加法")
    @Story("加法测试")
    public void addTest() {
        assertEquals(3, Calculator.add(1, 2));
    }

    @BeforeEach()
    @Description("清理")
    public void clear() {
        Calculator.clear();
    }

    @Test
    @Description("累加法")
    @Story("累加法测试")
    public void countTest() {
        assertEquals(3, Calculator.count(5), "不符合预期");

    }

    @Test
    @Description("减法")
    @Story("减法测试")
    public void subtractTest() {
        assertEquals(3, Calculator.subtract(5, 10), "不符合预期");

    }

    @Test
    @Description("乘法")
    @Story("乘法测试")
    public void multiplyTest() {
        assertEquals(2, Calculator.multiply(1, 2));

    }

    @Test
    @Description("除法")
    @Story("除法测试")
    public void divideTest() {
        assertEquals(0, Calculator.divide(1, 2));

    }


}
