package com.ar.concesionaria.models;

public class Vehiculo {

	protected Double precio;
	protected String marca;
	protected String modelo;
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public StringBuilder printPrecio() {

		String aux = String.format("%.2f", this.precio);
		StringBuilder precio = new StringBuilder(aux);
	    precio.insert(precio.length() - 6, ".");
	    return precio;
	}

}
