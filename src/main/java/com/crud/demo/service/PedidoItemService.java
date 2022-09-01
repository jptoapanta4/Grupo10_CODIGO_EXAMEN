package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.interfaceService.IpedidoItemService;
import com.crud.demo.interfaces.IPedidoItem;
import com.crud.demo.modelo.PedidoItem;

@Service
public class PedidoItemService implements IpedidoItemService{
	
	@Autowired
	private IPedidoItem data;

	@Override
	public List<PedidoItem> listar() {
		return (List<PedidoItem>)data.findAll();
	}

	@Override
	public Optional<PedidoItem> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(PedidoItem pi) {
		int res=0;
		PedidoItem pedidoItem=data.save(pi);
		if(!pedidoItem.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}
	
}
