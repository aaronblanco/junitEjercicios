package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Ejercicio3Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"2, *****",
				"5, *****",
				"-1, número erróneo",
				"6, ******",
				"15, ************",
				"12, ************",
				"8, ********"})
	
	void testTransformar(int input, String expected) {
		Ejercicio3 c = new Ejercicio3();
		assertEquals(expected, c.transformador(input));
	
	}

}
