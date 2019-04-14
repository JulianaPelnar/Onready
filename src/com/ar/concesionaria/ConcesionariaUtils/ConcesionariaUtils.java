package com.ar.concesionaria.ConcesionariaUtils;
import java.util.Collections;

import com.ar.concesionaria.models.Concesionaria;
import com.ar.concesionaria.models.Vehiculo;
//import java.util.regex.Pattern;

public abstract class ConcesionariaUtils {
	
	// Método que no imprime espacios
	/*
	public static void printList(Concesionaria c) {
		for (Vehiculo veh : c.getLista()) {
			System.out.println(veh);
		}
		System.out.println("=============================");
	}*/
	
	/**PrintList(Concesionaria c) <br><br>
	 * Prints the list of all elements in the ArrayList 
	 * of vehicle.
	 * 
	 * @param c
	 */
	public static void printList(Concesionaria c) {
		int i = 0;
		int j = c.getLista().size();
		for (i = 0; i < j ; i++) {
			if(i > 0 && i < j - 1) {
				System.out.println("            " + c.getLista().get(i));
			} else {
				System.out.println(c.getLista().get(i));
			}
		}
		System.out.println("=============================");
	}
	
	/**maxPrice(Concesionaria c) <br><br>
	 * Returns brand and model of more expensive class. Realizes 
	 * comparison between two Double.
	 * 
	 * @param c
	 */
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

	/**minPrice(Concesionaria c) <br><br>
	 * Returns brand and model of less expensive class. Realizes 
	 * comparison between two Double.
	 * 
	 * @param c
	 */
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
	
	/**hasLetter(Concesionaria c, String letter) <br><br>
	 * Search for a vehicle that contains the letter received with the parameter on its model. 
	 * It uses a boolean to indicate and print if the letter is founded.
	 * 
	 * @param c
	 */
	public static void hasLetter(Concesionaria c, String letter) {
		for(Vehiculo veh : c.getLista()) {
			boolean found = veh.getModelo().contains(letter);
			if (found) {
				System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + veh.getMarca() +
						" " + veh.getModelo() + " $" + veh.printPrecio());
			}
		}
	}
	
	
	/**sortByPrice(Concesionaria c) <br><br>
	 * Sort elements on the list from more expensive to minus expensive. 
	 * I consider more understandable to use Comparator interface to sort arrays. 
	 * Ask about it.
	 * 
	 * @param c
	 */
	/*
	public static void sortByPrice(Concesionaria c) {
		int i, j;
		Vehiculo veh1, veh2;
		for(i = 0; i < c.getLista().size() - 1; i++) {
			for(j = 0; j < c.getLista().size() - 1; j++) {
				veh1 = c.getLista().get(j);
				veh2 = c.getLista().get(j + 1);
				if(veh1.getPrecio() < veh2.getPrecio()) {
					c.getLista().set(j, veh2);
					c.getLista().set(j + 1, veh1);
				}
			}
		}
		System.out.println("=============================");
		System.out.println("Vehículos ordenados por precio de mayor a menor: ");
		for(Vehiculo veh : c.getLista()) {
			System.out.println(veh.getMarca() +" " + veh.getModelo());
		}
	}*/
	
	/**sortByPriceUsingCollection(Concesionaria c) <br><br>
	 * Sort elements on the list from more expensive to minus expensive using Comparator interface.
	 * 
	 * @param c
	 */
	public static void sortByPrice(Concesionaria c) {
		Collections.sort(c.getLista(), new SortByPrecio());
		for(Vehiculo veh : c.getLista()) {
			System.out.println(veh.getMarca() +" " + veh.getModelo());
		}
	}
}









