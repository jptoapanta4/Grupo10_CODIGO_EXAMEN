package com.crud.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.PedidoItem;

@Repository
public interface IPedidoItem extends CrudRepository<PedidoItem, Integer>{

}
