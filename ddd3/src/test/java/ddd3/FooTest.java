package ddd3;

import org.junit.Test;

public class FooTest {

	@Test(expected=UnsupportedOperationException.class)
	public void testFoo() throws Exception {
		new Foo();
	}

}
