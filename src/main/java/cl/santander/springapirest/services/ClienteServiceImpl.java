package cl.santander.springapirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.santander.springapirest.dao.IClienteDao;
import cl.santander.springapirest.entity.Cliente;
@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	public List<Cliente> findAll() {
		// va realizar el select * from "nombredelatabla"
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public Cliente findById(Integer id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}

}
