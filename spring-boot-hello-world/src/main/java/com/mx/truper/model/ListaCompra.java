package com.mx.truper.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Table(name = "ListaCompra")
@Data
public class ListaCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Integer idLista;
	
//	@OneToMany(mappedBy = "listaCompra")
//    private List<ListaCompraDetalle> detalles;
	
	@JoinColumn(name="idCliente")
	@ManyToOne
	@NotNull
	private Cliente cliente;
	@Column(name = "nombre", length = 50)
	@NotNull
	private int nombre;
	@Temporal(TemporalType.DATE)
	@Column(name = "fechaRegistro")
	private Date fechaRegistro;
	@Temporal(TemporalType.DATE)
	@Column(name = "fechaUltimaActualizacion")
	private Date fechaUltimaActualizacion;
	@Column(name = "activo")
	private Boolean activo;

}
