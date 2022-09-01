package com.crud.demo.interfaceService;

import java.util.List;
import java.util.Optional;


import com.crud.demo.modelo.Producto;

public interface IproductoService {
	public List<Producto>listar();
	public List<Producto>detail(int id);
	public Optional<Producto>listarId(int id);
	public int save(Producto pro);
	public void delete(int id);

}
