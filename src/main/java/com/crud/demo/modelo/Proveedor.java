package com.crud.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_proveedor;
	private String nombre_proveedor;
	private String ciudad;
	private String estado;
	private String Email;
	
	
	public Proveedor() {
		
	}
	
	public Proveedor(int codigo_proveedor, String nombre_proveedor, String ciudad, String estado, String email) {
		super();
		this.codigo_proveedor = codigo_proveedor;
		this.nombre_proveedor = nombre_proveedor;
		this.ciudad = ciudad;
		this.estado = estado;
		Email = email;
	}

	public int getCodigo_proveedor() {
		return codigo_proveedor;
	}

	public void setCodigo_proveedor(int codigo_proveedor) {
		this.codigo_proveedor = codigo_proveedor;
	}

	public String getNombre_proveedor() {
		return nombre_proveedor;
	}

	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
	

}
