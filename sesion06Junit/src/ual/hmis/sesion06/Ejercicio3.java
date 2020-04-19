package ual.hmis.sesion06;

public class Ejercicio3 {
	
	
	
	
	
	public String transformador(int numero){
		String cadena = "";
		if(numero < 0)
			return cadena ="número erróneo";
		else if(numero <= 5)
			return cadena = "*****";
		else if(numero > 12)
			return cadena = "************";
		else {
			for(int i = 1; i<= numero; i++) {
				cadena = cadena + "*"; 
			}
		}
		return cadena;
	}

}
