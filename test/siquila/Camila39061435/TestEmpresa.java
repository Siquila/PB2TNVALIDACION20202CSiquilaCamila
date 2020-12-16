package siquila.Camila39061435;

import static org.junit.Assert.assertEquals;

import java.util.TreeSet;

import org.junit.Test;

import siquila.Camila39061435.Camion;
import siquila.Camila39061435.Empresa;
import siquila.Camila39061435.TiendaCamion;

public class TestEmpresa {
	
	
	//Opcional
	@Test
	public void queSeAgregueUnCamion() {
		Camion camion = new Camion ("ASC1465");
		Empresa nueva = new Empresa ("La coral");
		nueva.agregarCamion(camion);
	}
	
	
//Obligatorio
	@Test
	public void QueSeObtengaUnaListaDeCaionesTiendaOrdenadosPorPatentes() {
		
		
	}


}
