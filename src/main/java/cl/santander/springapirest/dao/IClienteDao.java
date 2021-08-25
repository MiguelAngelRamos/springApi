package cl.santander.springapirest.dao;

import org.springframework.data.repository.CrudRepository;

import cl.santander.springapirest.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Integer>{

	// metodo personalizados.
	
}
