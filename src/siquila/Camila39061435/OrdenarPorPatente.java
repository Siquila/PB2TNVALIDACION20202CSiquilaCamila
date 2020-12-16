package siquila.Camila39061435;

import java.util.Comparator;

public class OrdenarPorPatente implements Comparator< Camion> {

	@Override
	public int compare(Camion o1, Camion o2) {
		return o1.getPatente().compareTo(o2.getPatente());
	}

}
