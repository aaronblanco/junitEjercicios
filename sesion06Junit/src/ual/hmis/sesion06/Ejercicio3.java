package ual.hmis.sesion06;

public class Ejercicio3 {
	/**
	 * Campo numTres.
	 */
	private final int numCero = 0;
	/**
	 * Campo numCinco.
	 */
	private final int numCinco = 5;
	/**
	 * Campo numDoce.
	 */
	private final int numDoce = 12;

	/**
	 * @param numero int.
	 * @return cadena
	 */
	public String transformador(int numero) {
		String cadena = "";
		if (numero < numCero) {
			return "número erróneo";
		} else if (numero <= numCinco) {
			return "*****";
		} else if (numero > numDoce) {
			return "************";
		} else {
			for (int i = 1; i <= numero; i++) {
				cadena = cadena + "*";
			}
		}
		return cadena;
	}
}
