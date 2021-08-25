package cl.santander.springapirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.santander.springapirest.entity.Cliente;
import cl.santander.springapirest.services.IClienteService;

@RestController
@RequestMapping("/api") // http://localhost:8080/api/clientes
public class ClienteRestController {

	@Autowired
	private IClienteService clienteService;
	
	// Listar los clientes
	@GetMapping("/clientes") //http://localhost:8080/api/clientes
	public List<Cliente> obtenerClientes() {
		return clienteService.findAll();
	}
	
	@GetMapping("/clientes/{id}") // http://localhost:8080/api/clientes/1
	public Cliente show(@PathVariable Integer id) {
		return clienteService.findById(id);
	}
	
}
