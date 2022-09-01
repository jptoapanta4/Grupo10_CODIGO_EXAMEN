package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.interfaceService.IproveedorService;
import com.crud.demo.interfaces.IProveedor;
import com.crud.demo.modelo.Proveedor;

@Service
public class ProveedorService  implements IproveedorService{
	
	@Autowired
	private IProveedor data;
	
	@Override
	public List<Proveedor> listar() {
		
		return (List<Proveedor>)data.findAll();
	}

	@Override
	public Optional<Proveedor> listarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Proveedor prov) {
		int res=0;
		Proveedor proveedor=data.save(prov);
		if(!proveedor.equals(null)) {
			res=1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
