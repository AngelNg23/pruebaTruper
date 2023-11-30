package com.mx.truper.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Table(name = "ListaCompraDetalle")
@Data
public class ListaCompraDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Integer idListaCompraDetalle;
	
//	@EmbeddedId
//    private ListaCompraDetalleID listaCompraDetalleID;
	
//	@ManyToOne
//    @JoinColumn(name = "id_lista_compra")
//    private ListaCompra listaCompra;
//	
//	@ManyToOne
//    @JoinColumn(name = "id_producto")
//    private Producto producto;
	
	
//	@JoinColumn(name="idProducto")
//	@ManyToOne
//	private Integer idProducto;

}
