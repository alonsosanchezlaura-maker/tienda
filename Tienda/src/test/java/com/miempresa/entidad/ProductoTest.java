package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class ProductoTest {
Producto producto;
@BeforeEach
void setUp() throws Exception {
	producto = new Producto("Laptop", 1000);
}

	

	    @Test
	    void testGetNombre() {
	        Producto p = new Producto("Laptop", 1000);

	        assertEquals("Laptop", p.getNombre());
	    }

	    @Test
	    void testGetPrecio() {
	        Producto p = new Producto("Laptop", 1000);

	        assertEquals(1000, p.getPrecio());
	    }

	    @Test
	    void testSetNombre() {
	    	
	        Producto p = new Producto("Laptop", 1000);

	        p.setNombre("Tablet");

	        assertEquals("Tablet", p.getNombre());
	    }

	    @Test
	    void testSetPrecio() {
	       double resultadoEsperado = 1000;
	        Producto p = new Producto("Laptop", 1000);

	        p.setPrecio(resultadoEsperado);

	        assertEquals(resultadoEsperado, p.getPrecio());
	    }

	    @Test
	    void testSetPrecioNegativo() {
	        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> producto.setPrecio(-100.0));
	       
	        String mensajeEsperado = "El precio no puede ser negativo: -100.0";
	        String mensajeActual = exception.getMessage();
	        assertEquals(mensajeEsperado, mensajeActual);
	    }
	        

	}


	
	
	