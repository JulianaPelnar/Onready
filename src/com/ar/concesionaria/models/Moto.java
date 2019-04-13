package com.ar.concesionaria.models;

public class Moto extends Vehiculo {
	
	private String cilindrada;
	
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	Moto(String marca, String modelo, String cilindrada, double precio){
		super.marca = marca;
		super.modelo = modelo;
		this.cilindrada = cilindrada;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Marca: " + this.marca + " // Modelo: " + this.modelo + " // Cilindrada: " + this.cilindrada + " // Precio: $" + this.precio;
	}
}
