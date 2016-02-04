import static org.junit.Assert.*;

import org.junit.Test;


public class RecDemoTest {

	@Test
	public void testRecDemo() {
		fail("Not yet implemented");
	}

	@Test
	public void testFactorialZero() {
		int expected = 1;
		int actual = RecDemo.factorial(0);
		assertEquals("Factorial of 0 is 1", expected, actual);
	}
	@Test
	public void testFactorial1() {
		int expected = 1;
		int actual = RecDemo.factorial(1);
		assertEquals("Factorial of 1 is 1", expected, actual);
	}
	@Test
	public void testFactorialLargeNumber() {
		int expected = 362880;
		int actual = RecDemo.factorial(9);
		assertEquals("Factorial of 9 is 362880", expected, actual);
	}

	@Test
	public void testFibonacciOfZero() {
		int expected = 0;
		int actual = RecDemo.fibonacci(0);
		assertEquals("Fibonacci of 0 is 0", expected, actual);
	}
	@Test
	public void testFibonacciOfOne() {
		int expected = 1;
		int actual = RecDemo.fibonacci(1);
		assertEquals("Fibonacci of 1 is 1", expected, actual);
	}
	

	@Test
	public void testIsPalTrue() {
		Boolean actual = RecDemo.isPal("racecar");
		assertEquals(true, actual);
		
	}
	@Test
	public void testIsPalOneLetter() {
		Boolean actual = RecDemo.isPal("A");
		assertEquals(true, actual);
	}

	@Test
	public void testIsPalNotTrueLongWord() {
		Boolean actual   = RecDemo.isPal("Hippopotamus");
		assertEquals( "Hippopotamus is not a Palendrome", false, actual);
	}
	
	@Test
	public void testMkPal() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

}
