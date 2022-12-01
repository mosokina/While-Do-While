package com.junit.class01;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    // Test Case for div
// 1. a=1, b=2, expected = 0
// 2. a=10, b=10, expected = 1
// 3. a=10, b=0, expected = Exception
// 4. a=0, b=10, expected = 0
// 5. a=20, b=10, expected = 2
// 6. a=-20, b=10, expected = -2
// 7. a=-20, b=-10, expected = 2
// 8. a=20, b=-10, expected = -2
// 9. a=0, b=0, expected = Exception
// 10. a=5, b=1, expected = 5
// 11. a=10000, b=2500, expected=4
    Calculator c = new Calculator();

    @Test
    public void verifyFirstNumberLessThanSecondNumber() {
        // 1. a=1, b=2, expected = 0
        int expectedResult = 0;
        int a = 1, b = 2;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
    @Test
    public void verifyWhenBothNumbersAreEqual() {
        // 2. a=10, b=10, expected = 1
        int expectedResult = 1;
        int a = 10, b = 10;
        int actualResult = c.div(b, a);
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    @Test

    public void verifySecondNumberIsZeroGivesException() {
        // 3. a=10, b=0, expected = Exception
        int expectedResult = 0;
        int a = 10, b = 0;
        int actualResult = c.div(b, a);
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    @Test
    public void verifyFirstNumberIsZero() {
        // 4. a=0, b=10, expected = 0
        int expectedResult = 0;
        int a = 0, b = 10;
        int actualResult = c.div(a,b);
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
    @Test
    public void verifyFirstNumberGreaterThanSecondNumber() {
        // 5. a=20, b=10, expected = 2
        int expectedResult = 2;
        int a = 20, b = 10;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
    @Test
    public void verifyFirstNumberIsNegative() {
        // 6. a=-20, b=10, expected = -2
        int expectedResult = -2;
        int a = -20, b = 10;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
    @Test
    public void verifyBothNumbersAreNegative() {
        // 7. a=-20, b=-10, expected = 2
        int expectedResult = 2;
        int a = -20, b = -10;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
    @Test
    public void verifySecondNumberIsNegative() {
        // 8. a=20, b=-10, expected = -2
        int expectedResult = -2;
        int a = 20, b = - 10;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }


    @Test (expected = ArithmeticException.class)
    public void verifySBothNumbersAreZeroGivesException() {
        // 9. a=0, b=0, expected = Exception

        int a = 0, b = 0;
        c.div(a, b);
    }
    @Test
    public void verifySecondNumberIsOne() {
        // 10. a=5, b=1, expected = 5
        int expectedResult = 5;
        int a = 5, b = 1;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
    @Test
    public void verifyBothNumbersAreLarge() {
        // 11. a=10000, b=2500, expected=4
        int expectedResult = 4;
        int a = 10000, b = 2500;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
}
