package com.mx.truper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.truper.model.Cliente;
import com.mx.truper.service.ClientesService;

@Controller
@RequestMapping("/clientes")
public class ClientesController {
	
	@Autowired
	private ClientesService service;

	@GetMapping("/addCliente")
	@PreAuthorize(value = "")
	public Cliente agregaCliente(@RequestBody Cliente cliente) {
		return service.agregaCliente(cliente);
	}
	
}
