package siquila.Camila39061435;

import java.util.ArrayList;
import java.util.List;


/*
 * La clase tiendaCamion pertenece a la familia de los camiones y tambien se comporta como una tienda
 * 
 * Desarrolle  e implemente los metodos pedido para que la clase cumpla con sus funcionalidades
 */
public class TiendaCamion extends Camion implements ITienda {
	
	private List<Producto> ventas;
	private Boolean estadoDeCaja; // True Abierta - False Cerrada
	
	
	public TiendaCamion(String patente) {
		super(patente);
		this.ventas = new ArrayList<Producto>();
		this.estadoDeCaja = false;
		
	}

	
	

	public void abrirCaja() {
		// Al Inicicio del dia limpia todas las ventas
		// y abre la caja diaria
		this.estadoDeCaja = true;
		this.ventas.clear();
		
		
	}




	@Override
	public void vender(Integer idProducto) throws CajaCerradaException, ProductoInexistenteException{
	Producto producto = null;
		if(this.estadoDeCaja == true) {
			this.ventas.add(producto);
		} else {
			throw new CajaCerradaException("La caja esta cerrada");
		}
		
	}




	@Override
	public Reporte cierreZ() {
		// TODO Auto-generated method stub
		return null;
	}


}
