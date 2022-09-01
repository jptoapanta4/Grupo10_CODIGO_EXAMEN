package com.crud.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ProductoID")
	private int ProductoID;
	@Column(name="NombreProducto")
	private String NombreProducto;
	@Column(name="Descripcion")
	private String Descripcion;
	@Column(name="Precio")
	private float Precio;
	@Column(name="Imagen")
	private String Imagen;
	@Column(name="Detalles")
	private String Detalles;
	@Column(name="codigo_proveedor")
	private int codigo_proveedor;
	@Column(name="Stock")
	private int Stock;
	
	public Producto(){
		
	}

	public Producto(int productoID, String nombreProducto, String descripcion, float precio, String imagen,
			String detalles, int codigo_proveedor, int stock) {
		
		ProductoID = productoID;
		NombreProducto = nombreProducto;
		Descripcion = descripcion;
		Precio = precio;
		Imagen = imagen;
		Detalles = detalles;
		this.codigo_proveedor = codigo_proveedor;
		Stock = stock;
	}

	public int getProductoID() {
		return ProductoID;
	}

	public void setProductoID(int productoID) {
		ProductoID = productoID;
	}

	public String getNombreProducto() {
		return NombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public float getPrecio() {
		return Precio;
	}

	public void setPrecio(float precio) {
		Precio = precio;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public String getDetalles() {
		return Detalles;
	}

	public void setDetalles(String detalles) {
		Detalles = detalles;
	}

	public int getCodigo_proveedor() {
		return codigo_proveedor;
	}

	public void setCodigo_proveedor(int codigo_proveedor) {
		this.codigo_proveedor = codigo_proveedor;
	}
	
	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}
	
	

	
	
	

	

}
