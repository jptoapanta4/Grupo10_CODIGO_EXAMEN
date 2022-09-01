	package com.crud.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Proveedor;



@Repository
public interface IProveedor extends CrudRepository<Proveedor, Integer>{
	

}
