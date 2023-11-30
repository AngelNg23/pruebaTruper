package com.mx.truper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.truper.model.ListaCompra;

@Repository
public interface ListaComprasRepository extends JpaRepository<ListaCompra, Integer>{

}
