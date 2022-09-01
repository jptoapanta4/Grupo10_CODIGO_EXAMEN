package com.crud.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Cliente;

@Repository
public interface ICliente extends CrudRepository<Cliente, Integer>{

}
