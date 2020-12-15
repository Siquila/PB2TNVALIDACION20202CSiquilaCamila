package siquila.Camila39061435;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import siquila.Camila39061435.Camion;
import siquila.Camila39061435.Producto;
import siquila.Camila39061435.TiendaCamion;

public class TestCamion {
	

	//opcional
	@Test
	public void queSeAgregueUnProducto() {
	Camion camion = new Camion ("ASC1465");
	Producto manzana = new Producto(0, 20.0, "Manzana", 2.0);
	Producto morron = new Producto (1, 30.0, "Morron", 2.0);
	assertTrue(camion.cargarProducto(manzana));
	assertTrue(camion.cargarProducto(morron));
	}
	
	//opcional
	@Test
	public void queSeDescargueUnProducto() throws ProductoInexistenteException{
		Camion camion = new Camion ("ASC1465");
		Producto manzana = new Producto(0, 20.0, "Manzana", 2.0);
		Producto morron = new Producto (1, 30.0, "Morron", 2.0);
		camion.cargarProducto(manzana);
		camion.cargarProducto(morron);
		
		camion.descargarProducto(morron.getId());
	}
	
	//obligatorio
	@Test
	
	public void queDescargueUnProductoInexistenteLanceUnaException() {
	
	
	}
	
}
