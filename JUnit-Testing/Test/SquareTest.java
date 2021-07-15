import static org.junit.Assert.*;

import org.junit.Test;

import business.BasicCalculations;

public class SquareTest {

	@Test
	public void test() {
		BasicCalculations calc = new BasicCalculations();
		assertEquals(4, calc.square(2));
	}

}
