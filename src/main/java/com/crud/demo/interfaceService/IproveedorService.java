package com.crud.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.crud.demo.modelo.Proveedor;

public interface IproveedorService {
	public List<Proveedor>listar();
	public Optional<Proveedor>listarId(int id);
	public int save(Proveedor prov);
	public void delete(int id);

}
