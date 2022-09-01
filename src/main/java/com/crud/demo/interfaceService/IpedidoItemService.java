package com.crud.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.crud.demo.modelo.PedidoItem;

public interface IpedidoItemService {
	public List<PedidoItem>listar();
	public Optional<PedidoItem>listarId(int id);
	public int save(PedidoItem pi);
	public void delete(int id);

}
