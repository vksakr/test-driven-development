package currency;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApplicationTest {

	@Test
	public void testMultiplication() {
		Dollor five = new Dollor(5);
		five.times(2);
		assertEquals(10, five.amount);
	}
}
