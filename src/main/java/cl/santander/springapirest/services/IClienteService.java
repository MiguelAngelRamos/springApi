package cl.santander.springapirest.services;

import java.util.List;

import cl.santander.springapirest.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	public Cliente findById(Integer id);
}
