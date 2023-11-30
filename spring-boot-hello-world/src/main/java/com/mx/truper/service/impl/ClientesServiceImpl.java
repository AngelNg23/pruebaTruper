package com.mx.truper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.truper.model.Cliente;
import com.mx.truper.repository.ClientesRepository;
import com.mx.truper.service.ClientesService;

@Service
public class ClientesServiceImpl implements ClientesService{
	
	@Autowired
	private ClientesRepository repo;

	@Override
	public Cliente agregaCliente(Cliente cliente) {
		return repo.save(cliente);
	}

}
