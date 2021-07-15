import static org.junit.Assert.*;

import org.junit.Test;

import business.BasicCalculations;

public class CountATest {

	@Test
	public void test() {
		BasicCalculations calc = new BasicCalculations();
		assertEquals(2, calc.countA("This is a sample string to test."));
	}

}
