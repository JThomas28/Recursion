import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for recDemo class
 * 
 * @author JonathanThomas
 * @version 2/5/2016
 */
public class RecDemoTest {

    /**
     * Tests factorial of 0 is 1.
     */
    @Test
    public void testFactorialZero() {
        int expected = 1;
        int actual = RecDemo.factorial(0);
        assertEquals("Factorial of 0 is 1", expected, actual);
    }

    /**
     * Tests factorial of 1 is 1
     */
    @Test
    public void testFactorial1() {
        int expected = 1;
        int actual = RecDemo.factorial(1);
        assertEquals("Factorial of 1 is 1", expected, actual);
    }

    /**
     * Tests factorial of 9 is 362880
     */
    @Test
    public void testFactorialLargeNumber() {
        int expected = 362880;
        int actual = RecDemo.factorial(9);
        assertEquals("Factorial of 9 is 362880", expected, actual);
    }

    /**
     * Tests fibonacci of 0 is 0
     */
    @Test
    public void testFibonacciOfZero() {
        int expected = 0;
        int actual = RecDemo.fibonacci(0);
        assertEquals("Fibonacci of 0 is 0", expected, actual);
    }

    /**
     * Tests fibonacci of 1 is 1
     */
    @Test
    public void testFibonacciOfOne() {
        int expected = 1;
        int actual = RecDemo.fibonacci(1);
        assertEquals(expected, actual);
    }

    /**
     * Tests fibonacci of 3 is 2
     */
    @Test
    public void testFibonacciOfThree() {
        int expected = 2;
        int actual = RecDemo.fibonacci(3);
        assertEquals(expected, actual);
    }

    /**
     * Tests fibonacci of 9 is 34
     */
    @Test
    public void testFibonacciOfBigNumber() {
        int expected = 34;
        int actual = RecDemo.fibonacci(9);
        assertEquals(expected, actual);
    }

    /**
     * Tests if racecar is palindrome. Should be true
     */
    @Test
    public void testIsPalTrue() {
        Boolean actual = RecDemo.isPal("racecar");
        assertTrue(actual);

    }

    /**
     * If string is empty, it is not a palindrome
     */
    @Test
    public void testIsPalEmptyString() {
        Boolean actual = RecDemo.isPal("");
        assertTrue(actual);
    }

    /**
     * Test if single letter is palindrome. Should be true
     */
    @Test
    public void testIsPalOneLetter() {
        Boolean actual = RecDemo.isPal("A");
        assertTrue(actual);
    }

    /**
     * Tests if Hippopotamus is palindrome. Should be false
     */
    @Test
    public void testIsPalNotTrueLongWord() {
        Boolean actual = RecDemo.isPal("Hippopotamus");
        assertFalse("Hippopotamus is not a Palindrome", actual);
    }

    /**
     * Tests base case of mkPal. Should return $
     */
    @Test
    public void testMkPalZero() {
        String expected = "$";
        String actual = RecDemo.mkPal(0);
        assertEquals(expected, actual);
    }

    /**
     * Tests mkPal adds 1 x to each side of $. Should return 'x$x'
     */
    @Test
    public void testMkPalOne() {
        String expected = "x$x";
        String actual = RecDemo.mkPal(1);
        assertEquals(expected, actual);
    }

    /**
     * Tests mkPal adds 5 x's on either side of $. Should return 'xxxxx$xxxxx'
     */
    @Test
    public void testMkPalFive() {
        String expected = "xxxxx$xxxxx";
        String actual = RecDemo.mkPal(5);
        assertEquals(expected, actual);
    }

    /**
     * Tests constructor
     */
    @Test
    public void testObject() {
        RecDemo demo = new RecDemo();
        RecDemo demo2 = new RecDemo();
        assertNotSame(demo, demo2);
    }
}
