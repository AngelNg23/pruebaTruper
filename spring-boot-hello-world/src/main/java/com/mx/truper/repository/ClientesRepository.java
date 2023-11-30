package com.mx.truper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.truper.model.Cliente;

@Repository
public interface ClientesRepository extends JpaRepository<Cliente, Integer>{

}
