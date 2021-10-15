package pt.genesis.studio.pokemon;

import java.math.BigInteger;

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

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		String moviment1 = "E";
		String moviment2 = "NESO";
		String moviment3 = "NEXSO";
		String moviment4 = "NE SO";
		String moviment5 = "NSNSNSNSNS";
		String moviment6 = "NNOOSENNOOSE";
		String moviment7 = "OOOOOOOOEEEEEEEEE";
		String moviment8 = "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEENNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOSSSSOOOOOSOSOSONNNNNNSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSEEEEEEEEEEEEEEEEEEEEEEEEEEE";

		assertEquals(App.pokemonsCatch(moviment1), new BigInteger("2"));
		assertEquals(App.pokemonsCatch(moviment2), new BigInteger("4"));
		assertEquals(App.pokemonsCatch(moviment3), new BigInteger("4"));
		assertEquals(App.pokemonsCatch(moviment4), new BigInteger("4"));
		assertEquals(App.pokemonsCatch(moviment5), new BigInteger("2"));
		assertEquals(App.pokemonsCatch(moviment6), new BigInteger("11"));
		assertEquals(App.pokemonsCatch(moviment7), new BigInteger("10"));
		assertEquals(App.pokemonsCatch(moviment8), new BigInteger("342"));

	}
}
