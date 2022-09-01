package com.crud.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Pedido;

@Repository
public interface IPedido extends CrudRepository<Pedido, Integer> {

}
