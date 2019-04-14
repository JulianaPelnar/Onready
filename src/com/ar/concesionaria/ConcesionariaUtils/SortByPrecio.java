package com.ar.concesionaria.ConcesionariaUtils;

import java.util.Comparator;
import com.ar.concesionaria.models.Vehiculo;

public class SortByPrecio implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo a, Vehiculo b) {
		if(a.getPrecio() < b.getPrecio()) {
			return 1;
		} else if(a.getPrecio() > b.getPrecio()) {
			return -1;
		}
		return 0;
	}

}
