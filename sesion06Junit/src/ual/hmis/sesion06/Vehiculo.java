package ual.hmis.sesion06;

public class Vehiculo {

	private int numeroPasajeros;
	private int numeroRuedas;
	private double pesoSincarga;

	public Vehiculo() {

	}

	public int getNumeroPasajeros() {
	
		return this.numeroPasajeros;
	}

	public boolean setNumeroPasajeros(int numeroPasajeros) {
		if (numeroPasajeros < 0)
			return false;
		else {
			this.numeroPasajeros = numeroPasajeros;
			return true;

		}

	}

	public int getNumeroRuedas() {
		return this.numeroRuedas;
	}

	public boolean setNumeroRuedas(int numeroRuedas) {
		if (numeroRuedas < 0)
			return false;
		else {
			this.numeroRuedas = numeroRuedas;
			return true;

		}

	}

	public double getPesoSincarga() {
		return this.pesoSincarga;
	}

	public boolean setPesoSincarga(double pesoSincarga) {

		if (pesoSincarga < 0.0)
			return false;
		else {
			this.pesoSincarga = pesoSincarga;
			return true;
		} 

	}

}
