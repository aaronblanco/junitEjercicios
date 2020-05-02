package ual.hmis.sesion06;


/**
 * @author aaron
 *
 */
public class Ejercicio1 {
/**
 * Campo resto.
 */
@SuppressWarnings("unused")
private final int resto = 0;
/**
 * Campo numDos.
 */
private final int numDos = 2;
/**
 * Campo numTres.
 */
private final int numTres = 3;
/**
 * Campo numCinco.
 */
private final int numCinco = 5;
/**
 * @param resto int.
 * @return Resto de una división entre enteros (mod)
 */
public int transformar(int resto) {
	int resultado = 0;
	if (resto % numDos == 0) {
		resultado = transformar(resto / numDos);
	} else if (resto % numTres == 0) {
		resultado = transformar(resto / numTres);
	} else if (resto % numCinco == 0) {
		resultado = transformar(resto / numCinco);
	} else {
		return resto;
	}
	return resultado;
	}

}
