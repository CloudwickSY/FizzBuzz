import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class jUnitTests {
	ByteArrayInputStream in;

	@Before
	public void nothing() {

	}

	@Test
	public void testReadNum() {
		in = new ByteArrayInputStream("1".getBytes());
		int numRead = Main.ReadNum(in, System.out);
		assertEquals(1, numRead);
	}
	
	@Test
	public void testReadNumThrow() {
		in = new ByteArrayInputStream("a\n1".getBytes());
		int numRead = Main.ReadNum(in, System.out);
		assertEquals(1, numRead);
	}




	@Test
	public void testFizzBuzz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz", fb.version1(3));
		assertEquals("Buzz", fb.version1(5));
		assertEquals("11", fb.version1(11));
		assertEquals("FizzBuzz", fb.version1(15));
		assertEquals("Fizz", fb.version2(3));
		assertEquals("Buzz", fb.version2(5));
		assertEquals("11", fb.version2(11));
		assertEquals("FizzBuzz", fb.version2(15));
	}
	
	
	
	
	
	
	@After
	public void resetSystemIn() {

	}

}
