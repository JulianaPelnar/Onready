package com.ar.concesionaria.models;
import java.util.ArrayList;

public class Concesionaria {
	
	private ArrayList<Vehiculo> lista;
	
	public Concesionaria() {
		lista = new ArrayList<Vehiculo>();
	}

	public void setLista() {
		this.lista.add((Vehiculo) new Auto("Peugeot", "206", 4, 200000.00));
		this.lista.add((Vehiculo) new Moto("Honda", "Titan", "125c", 60000.00));
		this.lista.add((Vehiculo) new Auto("Peugeot", "208", 5, 250000.00));
		this.lista.add((Vehiculo) new Moto("Yamaha", "YBR", "160c", 80500.50));
	}
	
	public ArrayList<Vehiculo> getLista() {
		return this.lista;
	}
	
}