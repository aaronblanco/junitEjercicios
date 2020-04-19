package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio4Test {
	@ParameterizedTest (name = "{index} => Con entrada ({0}) y ({1}) sale ({2})")
	@CsvSource({"cadena, cadena, caden",
				"ey, aaq,  ",
				"eeey, aaaay, y",
				"heeey, yeeey, ey",
				", , "
				
				})
	
	void testTransformar(String input1,String input2, String expected) {
		Ejercicio4 c = new Ejercicio4();
		assertEquals(expected, c.contador(input1, input2));
	
	}
}
