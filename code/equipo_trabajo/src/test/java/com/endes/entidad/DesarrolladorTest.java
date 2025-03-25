package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DesarrolladorTest {
	
	Desarrollador desarrollador;

	@BeforeEach
	void setUp() throws Exception {
		desarrollador = new Desarrollador("33333333J", "David", 2100.0, "Java");
	}

	
	@Test
	@DisplayName("Debería devolver un DNI válido")
	void testObtenerDni() {
		String dniEsperado = "33333333J";
		
		assertEquals(dniEsperado, desarrollador.getDni());
	}
	
	@Test
	@DisplayName("Debería devolver un DNI válido")
	void testObtenerNombre() {
		String nombreEsperado = "David";
		
		assertEquals(nombreEsperado, desarrollador.getNombre());
	}
	
	@Test
	@DisplayName("Debería devolver sueldo base")
	void testObtenerSueldoBase() {
		Double sueldoEsperado = 2100.0;
		
		assertEquals(sueldoEsperado, desarrollador.getSueldoBase());
	}
	
	@Test
	@DisplayName("Debería mostrar el nuevo sueldo base")
	void pruebaEstablecerSueldoBase() {
		double sueldoEsperado = 2100.0;
		desarrollador.setSueldoBase(2100.0);
		assertEquals(sueldoEsperado, desarrollador.getSueldoBase(), "El sueldo del producto no se ha modificado correctamente");
		
	}
	
	@Test
	@DisplayName("Prueba set sueldo negativo")
	void testSetVentaNegativa() {
		Exception exception = assertThrows(IllegalArgumentException.class, ()->desarrollador.setSueldoBase(-1000));
		String mensajeEsperado = "El sueldo base no puede ser negativo.";
		assertEquals(mensajeEsperado, exception.getMessage());
	}
	
	@Test
	@DisplayName("Debería devolver el lenguaje principal")
	void testObtenerLenguaje() {
		String lenguajeEsperado = "Java";
		
		assertEquals(lenguajeEsperado, desarrollador.getLenguajePrincipal());
	}
	
	@Test
	@DisplayName("Mostrar sueldo tras la productividad")
	void pruebaEstablecerProductividad() {
		double sueldoEsperado = 2100.0;
		desarrollador.calcularProductividad();
		assertEquals(sueldoEsperado, desarrollador.getSueldoBase(), "El sueldo del producto no se ha modificado correctamente");
		
	}
	
	
	
}
