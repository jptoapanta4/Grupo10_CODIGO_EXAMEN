package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.interfaceService.IpedidoService;
import com.crud.demo.interfaces.IPedido;
import com.crud.demo.modelo.Pedido;

@Service
public class PedidoService implements IpedidoService{
	@Autowired
	private IPedido data;

	@Override
	public List<Pedido> listar() {
		return (List<Pedido>)data.findAll();
	}

	@Override
	public Optional<Pedido> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Pedido p) {
		int res=0;
		Pedido pedido=data.save(p);
		if(!pedido.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
