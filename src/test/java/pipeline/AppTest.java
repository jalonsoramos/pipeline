package pipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void sayHelloTest() throws Exception {
		assertEquals("Hello", new App().sayHello());
	}
}
