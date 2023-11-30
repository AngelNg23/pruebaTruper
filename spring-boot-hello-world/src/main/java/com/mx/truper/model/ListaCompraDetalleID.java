package com.mx.truper.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
//@Embeddable
public class ListaCompraDetalleID {
	
	private Integer idLista;
	private Integer idProducto;

}
