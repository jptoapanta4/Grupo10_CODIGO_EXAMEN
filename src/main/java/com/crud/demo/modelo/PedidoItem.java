package com.crud.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidositems")
public class PedidoItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PedidoItemID")
	private int PedidoItemID;
	@Column(name="PedidoID")
	private int PedidoID;
	@Column(name="ProductoID")
	private int ProductoID;
	@Column(name="Cantidad")
	private int Cantidad;
	
public PedidoItem(){
		
	}

public PedidoItem(int pedidoItemID, int pedidoID, int productoID, int cantidad) {
	
	PedidoItemID = pedidoItemID;
	PedidoID = pedidoID;
	ProductoID = productoID;
	Cantidad = cantidad;
}

public int getPedidoItemID() {
	return PedidoItemID;
}

public void setPedidoItemID(int pedidoItemID) {
	PedidoItemID = pedidoItemID;
}

public int getPedidoID() {
	return PedidoID;
}

public void setPedidoID(int pedidoID) {
	PedidoID = pedidoID;
}

public int getProductoID() {
	return ProductoID;
}

public void setProductoID(int productoID) {
	ProductoID = productoID;
}

public int getCantidad() {
	return Cantidad;
}

public void setCantidad(int cantidad) {
	Cantidad = cantidad;
}




	

}
