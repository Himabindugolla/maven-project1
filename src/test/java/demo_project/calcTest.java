package demo_project;

import static org.junit.Assert.*;

import org.junit.Test;
import pkg.calc;

public class calcTest {
	calc cal = new calc();

	@Test
	public void testsum() {
		assertEquals(10,cal.sum(5,5));
	}
	@Test
	public void testdiff() {
		assertEquals(0,cal.diff(5,5));
	}

}
