package com.mx.truper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.truper.model.ListaCompra;
import com.mx.truper.repository.ListaComprasRepository;
import com.mx.truper.service.ListaComprasService;

@Service
public class ListaComprasServiceImpl implements ListaComprasService{

	@Autowired
	private ListaComprasRepository repo;
	
	@Override
	public ListaCompra agregaCompra(ListaCompra lista) {
		return repo.save(lista);
	}

	@Override
	public void eliminaCompraByID(Integer idLista) {
		repo.deleteById(idLista);
	}

}
