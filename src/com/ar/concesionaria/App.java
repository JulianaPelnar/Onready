package com.ar.concesionaria;
import com.ar.concesionaria.ConcesionariaUtils.ConcesionariaUtils;
import com.ar.concesionaria.models.Concesionaria;

public class App {

	public static void main(String args[]) {
		Concesionaria c = new Concesionaria();
		c.setLista();
		ConcesionariaUtils.printList(c);
		ConcesionariaUtils.maxPrice(c);
		ConcesionariaUtils.minPrice(c);
		ConcesionariaUtils.hasLetter(c, "Y");
		ConcesionariaUtils.sortByPrice(c);
	}

}
