package com.mx.truper.service;

import com.mx.truper.model.ListaCompra;

public interface ListaComprasService {

	public ListaCompra agregaCompra(ListaCompra lista);
	
	public void eliminaCompraByID(Integer idLista);

}
