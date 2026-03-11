package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class ProductoTest {

	

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
	        Producto p = new Producto("Laptop", 1000);

	        p.setPrecio(500);

	        assertEquals(500, p.getPrecio());
	    }

	    @Test
	    void testSetPrecioNegativo() {
	    		        Producto p = new Producto("Laptop", 1000);

	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            p.setPrecio(-100);
	        });

	        String expectedMessage = "El precio no puede ser negativo";
	        String actualMessage = exception.getMessage();

	        assertTrue(actualMessage.contains(expectedMessage));

	        
	    }
	}


	
	
	