package com.crud.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PedidoID")
	private int PedidoID;
	@Column(name="ClienteID")
	private int ClienteID;
	@Column(name="FechaPedido")
	private String FechaPedido;
	
public Pedido() {
		
	}

public Pedido(int pedidoID, int clienteID, String fechaPedido) {
	PedidoID = pedidoID;
	ClienteID = clienteID;
	FechaPedido = fechaPedido;
}

public int getPedidoID() {
	return PedidoID;
}

public void setPedidoID(int pedidoID) {
	PedidoID = pedidoID;
}

public int getClienteID() {
	return ClienteID;
}

public void setClienteID(int clienteID) {
	ClienteID = clienteID;
}

public String getFechaPedido() {
	return FechaPedido;
}

public void setFechaPedido(String fechaPedido) {
	FechaPedido = fechaPedido;
}





}
