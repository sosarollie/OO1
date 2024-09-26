package ar.edu.unlp.info.oo1.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;
	

	public Balanza() {
		productos = new ArrayList<Producto>();
	}
	
	public List<Producto> getProductos(){
		return productos;
	}
	
	public int getCantidadDeProductos() {
		int cantidadDeProductos = 0;
		for (Producto producto : productos) {
			cantidadDeProductos++;
		}
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto producto: productos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}

	public double getPesoTotal() {
		double pesoTotal = 0;
		for (Producto producto: productos) {
			pesoTotal += producto.getPeso();
		}
		return pesoTotal;
	}

	public void ponerEnCero() {
		productos.clear();
	}
	
	
	public void agregarProducto (Producto producto) {
		productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		return new Ticket();
	}
}
