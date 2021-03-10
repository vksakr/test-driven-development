package currency;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApplicationTest {

	@Test
	public void testMultiplication() {
		Dollor five = new Dollor(5);
		Dollor product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}
}
