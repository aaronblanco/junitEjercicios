package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Ejercicio8Test {
	
		
		
	
	  
		@ParameterizedTest (name = "{index} => Con entrada ({0}) sale ({1})")
		@CsvSource({
					"-1, false",
					"1, true",
					"5, true",
					})
		
		void testVehiculoPasajeros( int input1, Boolean expected) {
			
			Vehiculo vehiculo = new  Vehiculo();
			assertEquals(expected, vehiculo.setNumeroPasajeros(input1));
		
		}
		
		@ParameterizedTest (name = "{index} => Con entrada ({0}) sale ({1})")
		@CsvSource({
					"-1, 0",
					"1, 1",
					"5, 5",
					})
		
		void testVehiculoPasajerosGet( int input1, int expected) {
			
			Vehiculo vehiculo = new  Vehiculo();
			vehiculo.setNumeroPasajeros(input1);
			
			assertEquals(expected, vehiculo.getNumeroPasajeros());
		
		}
		
		
		
		
		@ParameterizedTest (name = "{index} => Con entrada ({0}) sale ({1})")
		@CsvSource({
					"-1, false",
					"1, true",
					"5, true",
					})
		
		
		void testVehiculoRuedas( int input1, Boolean expected) {
			
			Vehiculo vehiculo = new  Vehiculo();
			assertEquals(expected, vehiculo.setNumeroRuedas(input1));
		
		}
		
		
		@ParameterizedTest (name = "{index} => Con entrada ({0}) sale ({1})")
		@CsvSource({
					"-1, 0",
					"1, 1",
					"5, 5",
					})
		
		void testVehiculoRuedas( int input1, int expected) {
			
			Vehiculo vehiculo = new  Vehiculo();
			vehiculo.setNumeroRuedas(input1);
			
			assertEquals(expected, vehiculo.getNumeroRuedas());
		
		}
		
	
		
		
		@ParameterizedTest (name = "{index} => Con entrada ({0}) sale ({1})")
		@CsvSource({
					"-1, false",
					"1.1, true",
					"5.5, true",
					})
		
		
		void testVehiculoPeso( double input1, Boolean expected) {
			
			Vehiculo vehiculo = new  Vehiculo();
			assertEquals(expected, vehiculo.setPesoSincarga(input1));
		
		}
		

		@ParameterizedTest (name = "{index} => Con entrada ({0}) sale ({1})")
		@CsvSource({
				"-1, 0.0",
				"1.1, 1.1",
				"5.5, 5.5",
					})
		
		void testVehiculoPesoGet( double input1, double expected) {
			
			Vehiculo vehiculo = new  Vehiculo();
			vehiculo.setPesoSincarga(input1);
			
			assertEquals(expected, vehiculo.getPesoSincarga());
		
		}
		
		
		
		
	
		
		@Test
	void ferrySinNada() {

		Ferry ferry = new Ferry(0, 0, 0);

		for(int i = 0; i <10; i++) {
			Vehiculo vehiculo = new  Vehiculo();
			vehiculo.setNumeroPasajeros(5);
			vehiculo.setNumeroRuedas(4);
			vehiculo.setPesoSincarga(2000.0);
			if(ferry.embarcarVehiculo(vehiculo) == false)
				break;
		}

		
		
		assertEquals(ferry.superadoMaximoPeso(), false);
		assertEquals(ferry.superadoMaximoVehiculos(), false);
		assertEquals(ferry.totalVehiculos(), 0);
		assertEquals(ferry.vacio(), true);
		
	}
		
		@Test
	void ferryNormalPocosPasajeros() {

		Ferry ferry = new Ferry(10, 10000.0, 10);

		for(int i = 0; i <10; i++) {
			Vehiculo vehiculo = new  Vehiculo();
			vehiculo.setNumeroPasajeros(5);
			vehiculo.setNumeroRuedas(4);
			vehiculo.setPesoSincarga(2000.0);
			if(ferry.embarcarVehiculo(vehiculo) == false)
				break;
		}

		
		
		assertEquals(ferry.superadoMaximoPeso(), false);
		assertEquals(ferry.superadoMaximoVehiculos(), false);
		assertEquals(ferry.totalVehiculos(),2);
		assertEquals(ferry.vacio(), false);
	}
		
		
		@Test
	void ferryNormalMuchosPasajeros() {

		Ferry ferry = new Ferry(100, 10000.0, 10);

		for(int i = 0; i <10; i++) {
			Vehiculo vehiculo = new  Vehiculo();
			vehiculo.setNumeroPasajeros(5);
			vehiculo.setNumeroRuedas(4);
			vehiculo.setPesoSincarga(2000.0);
			if(ferry.embarcarVehiculo(vehiculo) == false)
				break;
		}

		
		
		assertEquals(ferry.superadoMaximoPeso(), false);
		assertEquals(ferry.superadoMaximoVehiculos(), false);
		assertEquals(ferry.totalVehiculos(),5);
		assertEquals(ferry.vacio(), false);
	}
		
		@Test
	void ferryNormalSupMaximoVehiculosyPesoMax() {

		Ferry ferry = new Ferry(100, 10000.0, 10);

	
		ferry.setNumPasajeros(1000);
		ferry.setPesoVehiculos(20000.0);
		assertEquals(ferry.superadoMaximoPeso(), true);
		assertEquals(ferry.superadoMaximoVehiculos(), true);
	
	}
		
		
		
		
		
		@Test
	void Getter_Setter() {

		Ferry ferry = new Ferry(20, 100.0, 10);

	
		ferry.setNumMaximoPasajeros(10);
		ferry.setPesoMaximoVehiculos(10.0);
		
		Vehiculo v = new Vehiculo();
		v.setNumeroPasajeros(10);
		v.setPesoSincarga(10.0);
		ferry.embarcarVehiculo(v);
		
		assertEquals(ferry.getNumMaximoPasajeros(), 10);
		assertEquals(ferry.getPesoMaximoVehiculos(), 10.0);
		assertEquals(ferry.getNumPasajeros(), 10);
		assertEquals(ferry.getPesoVehiculos(), 10.0);
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
