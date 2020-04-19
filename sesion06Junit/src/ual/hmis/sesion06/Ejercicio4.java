package ual.hmis.sesion06;

public class Ejercicio4 {

	
	
	public String contador(String p1, String p2){
		String cadena = "";
		
		if( p1 == null  ||  p2 == null )
			return null;
		
		
		for(int i = 0; i <= p1.length()-1; i++) {
			
			for(int j = 0; j <= p2.length()-1; j++) {
				
				if(p1.charAt(i)==p2.charAt(j)) {
					if(cadena.contains(p1.charAt(i) + ""))
						continue;
					cadena = cadena + p1.charAt(i);
				}
			}
			
		}
		if(cadena.isEmpty()) 
			return null;
		return cadena;
	}
}
