package ual.hmis.sesion06;

public class Ejercicio4 {
	/**
	 * @param param1 int.
	 * @param param2 int.
	 * @return cadena.
	 */
	public String contador(String param1, String param2) {
		String string = "";
		if (param1 == null || param2 == null) {
			return null;
		}
		for (int i = 0; i <= param1.length() - 1; i++) {
			for (int j = 0; j <= param2.length() - 1; j++) {
				if (param1.charAt(i) == param2.charAt(j)) {
					if (string.contains(param1.charAt(i) + "")) {
						continue;
					}
					string = string + param1.charAt(i);
				}
			}
		}
		if (string.isEmpty()) {
			return null;
		}
		return string;
	}
}
