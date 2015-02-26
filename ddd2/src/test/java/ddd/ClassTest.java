package ddd;

import static org.junit.Assert.*;

import ddd.exception.ExceedingMaxCapacityException;
import org.junit.Test;

public class ClassTest {

	@Test
	public void testThatClassHasCapacityLimit() throws Exception {
		new Class(30);
	}

	@Test(expected = ExceedingMaxCapacityException.class)
	public void testThatClassShouldNotHaveMaxZero() {
		new Class(0);
	}

	@Test
	public void verifyThatYouCanEnrollUpUntilLimit() throws Exception {
		Class class1 = new Class(10);
		try {
			for (int i = 0; i < 10; i++) {
				class1.doEnroll();
			}
		} catch (ExceedingMaxCapacityException e) {
			fail();
		}
	}

	@Test(expected = ExceedingMaxCapacityException.class)
	public void verifyThatYouCannotEnrollToAClassWhenCapacityIsFull()
			throws Exception {
		Class class1 = new Class(10);
		for (int i = 0; i < 11; i++) {
			class1.doEnroll();
		}
	}

}
