package com.grimolizzi.GoldenCoin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public void testApp() {
		
		assertTrue(Utils.countCoin(".o..oo.o.") == 4);

		assertTrue(App.getPath(".oo..", HorizontalDirection.LEFT, Item.COIN).equals("<<xx<"));
		
		String[] lines = new String[] {".o..", "o.*o", ".o..", "...."};
		
		assertTrue(Utils.countCoin(lines) == 4);
		
		assertTrue(App.getPath(lines).equals(">x>>vx<<xv>x>>v<<<<>>>>^<<<<^>>x>^<<<<"));
		
		String[] lines2 = new String[] {".o*", ".**", "o.."};
		
		System.out.println();
		
		assertTrue(App.getPath(lines2).equals(">x>v<<<vx>><<<^>xx^x<<"));
		
	}
}
