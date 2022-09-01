package com.crud.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.crud.demo.modelo.Pedido;

public interface IpedidoService {
	public List<Pedido>listar();
	public Optional<Pedido>listarId(int id);
	public int save(Pedido p);
	public void delete(int id);

}
