package siquila.Camila39061435;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

//import ar.edu.unlam.pb220202c.eva03.Vehiculo;
//import ar.edu.unlam.pb220202c.eva03.OrdenarPorPatente;

public class Empresa {

	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	private String nombre;
	private Integer idCamion;
	private HashMap<Integer, Camion> flota;

	public Empresa() {
		
	}

	public Empresa (String nombre) {
		this.nombre = nombre;
		this.idCamion = 0;
		this.flota = new HashMap <Integer, Camion>();
	}
	public void agregarCamion(Camion camion) {

		// se agrega uncamion el primer camion tiene como identificador 0 el el segundo
		// 1 2 3.4
		
		flota.put(idCamion, camion);
		this.idCamion++;
	}

	public Integer cantidadDeCamiones() {
		return flota.size();
	}

	public TreeSet<Camion> obtenerTiendascamionOrdenadoPorPatente() {
		TreeSet<Camion> tiendasCamion = new TreeSet<Camion>(new OrdenarPorPatente());
		for (Camion camion : tiendasCamion) {
			if (camion instanceof TiendaCamion) {
				tiendasCamion.add(camion);
			}
	
		}
		return tiendasCamion;
		
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
