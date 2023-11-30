package com.mx.truper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Table(name="Productos")
@Data
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Integer idProducto;
	@Column(name="clave", length=15)
	private int clave;
	@Column(name="descripcion", length=150)
	private int descripcion;
	@Column(name="activo")
	private Boolean activo;

}
