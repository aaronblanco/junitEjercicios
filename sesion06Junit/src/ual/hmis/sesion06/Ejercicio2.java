package ual.hmis.sesion06;

public class Ejercicio2 {
	/**
	 * Campo numTreinta.
	 */
	private final int numTreinta = 30;

	/**
	 * @param user usuario.
	 * @param password pass.
	 * @return llamar al método de la bbdd.
	 */
	public boolean login(String user, String password) {
		if (user.isEmpty() || password.isEmpty()) {
			return false;
		} else if (user.length() >= numTreinta || password.length() >= numTreinta) {
			return false;
		}
		return compruebaLoginEnBD(user, password);
	}

	/**
	 * @param user usuario.
	 * @param password pass.
	 * @return método mock (simulado).
	 */
	public boolean compruebaLoginEnBD(String user, String password) {
		if (user.equals("user") && password.equals("pass")) {
			return true;
		}
		return false;
	}
}
