package ual.hmis.sesion06;

import java.util.ArrayList;

public class Ferry {
private int numMaximoPasajeros; //Numero Maximo de pasajeros
private int numPasajeros; //Numero actual de pasajeros
private double pesoMaximoVehiculos;//Peso Maximo de vehiculos
private double pesoVehiculos; //Peso actual de los vehiculos
private int numVehiculos;//Numero total de vehiculos
private ArrayList<Vehiculo> listaVehiculos;

public Ferry(int numPasa, double pesoMax, int numTotalVehiculos) {
	this.numMaximoPasajeros = numPasa;
	this.pesoMaximoVehiculos = pesoMax;
	this.numVehiculos = numTotalVehiculos;
	this.listaVehiculos = new ArrayList<Vehiculo>();
	}
	// Embarca un vehículo añadiéndolo a la lista
public boolean embarcarVehiculo (Vehiculo v) {
	if (this.listaVehiculos.size() < this.numVehiculos) {
		if (this.pesoVehiculos + v.getPesoSincarga() > this.pesoMaximoVehiculos || this.numPasajeros + v.getNumeroPasajeros() > this.numMaximoPasajeros) {
			return false;
		}
		this.pesoVehiculos = this.pesoVehiculos + v.getPesoSincarga();
		this.numPasajeros = this.numPasajeros + v.getNumeroPasajeros();	
		return this.listaVehiculos.add(v);
	}else {
		return false;
	}		
}
		// devuelve el número total de vehículos embarcados  
public int totalVehiculos() {
	return this.listaVehiculos.size();
}
public int getNumMaximoPasajeros() {
	return numMaximoPasajeros;
}
public void setNumMaximoPasajeros(int numMaximoPasajeros) {
	this.numMaximoPasajeros = numMaximoPasajeros;
}
public int getNumPasajeros() {
	return numPasajeros;
}
public void setNumPasajeros(int numPasajeros) {
	this.numPasajeros = numPasajeros;
}
public double getPesoMaximoVehiculos() {
	return pesoMaximoVehiculos;
}
public void setPesoMaximoVehiculos(double pesoMaximoVehiculos) {
	this.pesoMaximoVehiculos = pesoMaximoVehiculos;
}
public double getPesoVehiculos() {
	return pesoVehiculos;
}
public void setPesoVehiculos(double pesoVehiculos) {
	this.pesoVehiculos = pesoVehiculos;
}
// verdadero si no hay ningún vehículo
public boolean vacio() {
	return this.listaVehiculos.isEmpty();
}
	// verdadero si el número total de los vehículos supera el máximo
public boolean superadoMaximoVehiculos() {
	if(numPasajeros > numMaximoPasajeros) {
		return true;
	}
	return false;
}
// verdadero si el peso total de los vehículos supera el máximo
public boolean superadoMaximoPeso()  {
	if(pesoVehiculos > pesoMaximoVehiculos) {
		return true;
	}
	return false;
}
}
