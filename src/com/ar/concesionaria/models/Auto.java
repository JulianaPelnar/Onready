package com.ar.concesionaria.models;

public class Auto extends Vehiculo {
	
	private int puertas;
	
	Auto(String marca, String modelo, int puertas, Double precio){
		super.marca = marca;
		super.modelo = modelo;
		this.puertas = puertas;
		super.precio = precio;
	}
	@Override
	public String toString() {
		return "Marca: "+ this.marca + " // Modelo: "+ this.modelo +" // Puertas: "+ this.puertas + 
				" // Precio: $" + this.printPrecio();
	}
}