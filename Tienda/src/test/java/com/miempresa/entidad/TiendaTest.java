package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiendaTest {
	
	@BeforeEach
	void setUp() throws Exception {
		
		
	}

	@Test 
    void testAgregarProducto() {
        Tienda tienda = new Tienda();
        Producto p = new Producto("Laptop", 1000);
        tienda.agregarProducto(p);
        assertEquals(1, tienda.obtenerProductos().size());
        
    }

    @Test
    void testObtenerProductos() {
        Tienda tienda = new Tienda();

        Producto p1 = new Producto("Laptop", 1000);
        Producto p2 = new Producto("Tablet", 500);

        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);

        List<Producto> productos = tienda.obtenerProductos();

        assertEquals(2, productos.size());
        assertEquals("Laptop", productos.get(0).getNombre());
        assertEquals("Tablet", productos.get(1).getNombre());
    }

    @Test
    void testCalcularPrecioTotal() {
        Tienda tienda = new Tienda();

        tienda.agregarProducto(new Producto("Laptop", 1000));
        tienda.agregarProducto(new Producto("Tablet", 500));
        tienda.agregarProducto(new Producto("Ratón", 50));

        double total = tienda.calcularPrecioTotal();

        assertEquals(1550, total);
    }
}


