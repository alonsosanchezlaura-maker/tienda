package com.miempresa.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Tienda representa una tienda que contiene una lista de productos.
 * Proporciona métodos para agregar productos, obtener la lista de productos
 * y calcular el precio total de todos los productos en la tienda.
 */
public class Tienda {
    private List<Producto> productos;	
    
    /**
	 * Constructor de la clase Tienda. Inicializa la lista de productos.
	 */
  
    public Tienda() {
        this.productos = new ArrayList<>();
    }
    /**
     * Agrega un producto a la tienda.
     * 
     * @param producto Producto que se añadirá a la tienda
     */

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }


    /**
     * Devuelve la lista de productos de la tienda.
     * 
     * @return lista de productos
     */
    public List<Producto> obtenerProductos() {
        return new ArrayList<>(productos);
    }

    /**
     * Calcula el precio total de todos los productos de la tienda.
     * 
     * @return suma de los precios de los productos
     */
    public double calcularPrecioTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
}