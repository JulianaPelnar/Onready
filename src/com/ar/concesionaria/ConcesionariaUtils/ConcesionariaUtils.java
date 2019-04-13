package com.ar.concesionaria.ConcesionariaUtils;
import com.ar.concesionaria.models.Concesionaria;
import com.ar.concesionaria.models.Vehiculo;
//import java.util.regex.Pattern;

public abstract class ConcesionariaUtils {
	
	public static void printList(Concesionaria c) {
		for (Vehiculo veh : c.getLista()) {
			System.out.println(veh);
		}
		System.out.println("=============================");
	}
	
	public static void maxPrice(Concesionaria c) {
		double max = 0.0;
		Vehiculo vehAux = new Vehiculo();
		for (Vehiculo veh : c.getLista()) {
			if (veh.getPrecio() > max) {
				max = veh.getPrecio();
				vehAux = veh;
			}
		}
		System.out.println("Vehículo más caro: " + vehAux.getMarca() + " " + vehAux.getModelo());
	}
	
	public static void minPrice(Concesionaria c) {
		double min = 9000000.0;
		Vehiculo vehAux = new Vehiculo();
		for (Vehiculo veh : c.getLista()) {
			if (veh.getPrecio() < min) {
				min = veh.getPrecio();
				vehAux = veh;
			}
		}
		System.out.println("Vehículo más barato: " + vehAux.getMarca() + " " + vehAux.getModelo());
	}
	
	public static void hasLetter(Concesionaria c) {
		for(Vehiculo veh : c.getLista()) {
			boolean found = veh.getModelo().contains("Y");
			if (found) {
				System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + veh.getMarca() +
						" " + veh.getModelo() + " $" + veh.getPrecio());
			}
		}
	}
	
	public static void sortByPrice(Concesionaria c) {
		int i, j;
		Vehiculo veh1, veh2;
		Concesionaria cAux = new Concesionaria();
		cAux.setLista();
		for(i = 0; i < c.getLista().size() - 1; i++) {
			for(j = 0; j < c.getLista().size() - i - 1; j++) {
				veh1 = c.getLista().get(j);
				veh2 = c.getLista().get(j + 1);
				if(veh1.getPrecio() < veh2.getPrecio()) {
					cAux.getLista().set(j, veh2);
					cAux.getLista().set(j + 1, veh1);
				}
			}
		}
		System.out.println("=============================");
		System.out.println("Vehículos ordenados por precio de mayor a menor: ");
		for(Vehiculo veh : cAux.getLista()) {
			System.out.println(veh.getMarca() +" " + veh.getModelo());
		}
	}
}









