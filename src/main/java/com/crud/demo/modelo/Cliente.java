package com.crud.demo.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes	")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ClienteID")
	private int ClienteID;
	@Column(name="RazonSocial")
	private String RazonSocial;
	@Column(name="Direccion")
	private String Direccion;
	@Column(name="Ciudad")
	private String Ciudad;
	@Column(name="Estado")
	private String Estado;
	@Column(name="CodigoPostal")
	private String CodigoPostal;
	@Column(name="Rif")
	private String Rif;
	@Column(name="Pais")
	private String Pais;
	@Column(name="Telefonos")
	private String Telefonos;
	
	public Cliente() {
		
	}

	public Cliente(int clienteID, String razonSocial, String direccion, String ciudad, String estado,
			String codigoPostal, String rif, String pais, String telefonos) {
		
		ClienteID = clienteID;
		RazonSocial = razonSocial;
		Direccion = direccion;
		Ciudad = ciudad;
		Estado = estado;
		CodigoPostal = codigoPostal;
		Rif = rif;
		Pais = pais;
		Telefonos = telefonos;
	}

	public int getClienteID() {
		return ClienteID;
	}

	public void setClienteID(int clienteID) {
		ClienteID = clienteID;
	}

	public String getRazonSocial() {
		return RazonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getCodigoPostal() {
		return CodigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		CodigoPostal = codigoPostal;
	}

	public String getRif() {
		return Rif;
	}

	public void setRif(String rif) {
		Rif = rif;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getTelefonos() {
		return Telefonos;
	}

	public void setTelefonos(String telefonos) {
		Telefonos = telefonos;
	}
	
	
	
	
	
	
}
