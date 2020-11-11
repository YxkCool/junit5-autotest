package com.testcase;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Kayenee
 * @Date: 2020/11/11 10:57
 * @since 1.0
 */
public class Junit5_1_1_FixtureExtend extends Junit5_1_1_Fixture{
    @BeforeAll
    public static void beforeChildAll() {
        System.out.println("beforeAll Child执行！");

    }

    @AfterAll
    public static void afterChildAll() {
        System.out.println("afterAll Child执行！");

    }

    @BeforeEach
    public void beforeChildEach() {
        System.out.println("beforeEach Child执行！");
    }

    @AfterEach
    public void afterChildEach() {
        System.out.println("afterEach Child执行！");

    }

    @Test
    public void testChildMethod01() {
        System.out.println("testMethod01 Child执行");
    }

    @Test
    public void testChildMethod02() {
        System.out.println("testMethod02 Child执行");
    }

    @Test
    public void testChildMethod03() {
        System.out.println("testMethod03 Child执行");
    }

}
