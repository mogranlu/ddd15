package ddd;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class Day2Test {

	@Test
	public void testDay2() throws Exception {

	}

	@Test(expected = UnsupportedOperationException.class)
	public void verifyThatSomethingSomething() {
		Day2 day2 = new Day2();
		day2.somethingSomething();
		assertThat(day2, is(equalTo((day2))));
	}

}
