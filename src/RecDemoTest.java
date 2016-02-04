import static org.junit.Assert.*;

import org.junit.Test;


public class RecDemoTest {

	@Test
	public void testRecDemo() {
		fail("Not yet implemented");
	}

	@Test
	public void testFactorial() {
		fail("Not yet implemented");
	}

	@Test
	public void testFibonacci() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsPal() {
		//RecDemo recdemo = new RecDemo();
		Boolean result = RecDemo.isPal("racecar");
		assertEquals(true, result);
		//fail("Not yet implemented");
	}
	@Test
	public void testIsPalOneLetter() {
		Boolean actual = RecDemo.isPal("A");
		assertEquals(true, actual);
	}

	@Test
	public void testIsPalNotTrueLongWord() {
		Boolean expected = false;
		Boolean actual   = RecDemo.isPal("Hippopotomaus");
		assertEquals( "Hippopotomaus is not a Palendrome", expected, actual);
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
