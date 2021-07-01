package com.bolsadeideas.springbootbackendapirestP.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springbootbackendapirestP.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
