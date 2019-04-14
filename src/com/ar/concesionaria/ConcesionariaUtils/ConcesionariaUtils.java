package com.ar.concesionaria.ConcesionariaUtils;
import java.util.Collections;

import com.ar.concesionaria.models.Concesionaria;
import com.ar.concesionaria.models.Vehiculo;
//import java.util.regex.Pattern;

public abstract class ConcesionariaUtils {
	
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
		double max = c.getLista().get(0).getPrecio();
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
		double min = c.getLista().get(0).getPrecio();
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
	
	/**sortByPriceUsingCollection(Concesionaria c) <br><br>
	 * Sort elements on the list from more expensive to minus expensive using Comparator interface.
	 * 
	 * @param c
	 */
	public static void sortByPrice(Concesionaria c) {
		System.out.println("=============================");
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		Collections.sort(c.getLista(), new SortByPrecio());
		for(Vehiculo veh : c.getLista()) {
			System.out.println(veh.getMarca() +" " + veh.getModelo());
		}
	}
}