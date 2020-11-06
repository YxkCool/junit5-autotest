package com.util;

/**
 * @author Kayenee
 * @Date: 2020/11/6 16:42
 * @since 1.0
 *
 */
public class Calculator {

    public static int result = 0;

    public static int add(int x, int y) {
        result = x + y;
        return result;
    }

    public static int count(int x)  {
        int i = result;
        result = i + x;
        return result;
    }

    public static int subtract(int x, int y) {
        result = x - y;
        return result;
    }

    public static int multiply(int x, int y) {
        result = x * y;
        return result;
    }

    public static int divide(int x, int y) {
        result = x / y;
        return result;
    }
}
