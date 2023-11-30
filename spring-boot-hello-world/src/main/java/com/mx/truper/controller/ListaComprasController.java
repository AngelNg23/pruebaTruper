package com.mx.truper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mx.truper.model.ListaCompra;
import com.mx.truper.service.ListaComprasService;

@Controller
@RequestMapping("/listaComprasController")
public class ListaComprasController {
	
	@Autowired
	private ListaComprasService service;

	@PostMapping("/guardaCompra")
	@PreAuthorize(value = "")
	public ListaCompra guardaCompra(@RequestBody ListaCompra lista) {
		return service.agregaCompra(lista);
	}
	
	@DeleteMapping("/eliminaCompra")
	@PreAuthorize(value = "")
	public void eliminaCompra(@RequestParam Integer idLista) {
		service.eliminaCompraByID(idLista);
	}

}
