package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;
import java.util.List;

public class Ticket extends Balanza{
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket () {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = super.getCantidadDeProductos();
		this.pesoTotal = super.getPesoTotal();
		this.precioTotal = super.getPrecioTotal();
	}
	
	public List<Producto> getProductos(){
		return super.getProductos();
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double impuesto() {
		return this.precioTotal * 0.21;
	}
}
