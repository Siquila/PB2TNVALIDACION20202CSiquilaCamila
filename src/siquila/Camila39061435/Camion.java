package siquila.Camila39061435;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion  {
	
	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	
	
	private String patente;
	private List <Producto> listaProductos;
	
	
	public Camion (String patente) {
	this.patente = patente;
	this.listaProductos = new ArrayList <Producto>();
	}
	
	
	public Boolean cargarProducto(Producto producto) {
		/*
		 * carga el producto en la lista de producto 
		 *   
		 * 
		 */
		this.listaProductos.add(producto);
		if (this.listaProductos.contains(producto)) {
			return true;
		}
		return false;
	
	}
	public Producto buscarProducto (Integer id) {
		for (Producto producto : listaProductos) {
			if(producto.getId().equals(id)) {
				return producto;
			}
			
		}
		return null;
	}
	public Producto descargarProducto(Integer idProducto) throws ProductoInexistenteException{
	
		/*
		 * buesca y un producto por su id y devuelve el producto encontrado
		 * por otro lado elimina dicho producto de la coleccion
		 * encaso que el idProducto no se encuentre retorna una exception ProductoInexistenteException
		 */
		Producto producto = null;
		if (this.buscarProducto(idProducto) == null) {
			throw new ProductoInexistenteException("Producto inexistente");
			
		}else {
			producto = this.buscarProducto(idProducto);
			this.listaProductos.remove(producto.getId());
		}
		return producto;
	
	}
	

	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public List<Producto> getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}


	
}
