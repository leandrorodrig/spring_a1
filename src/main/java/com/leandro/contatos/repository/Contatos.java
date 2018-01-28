package com.leandro.contatos.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandro.contatos.entity.Contato;

public interface Contatos extends JpaRepository<Contato, Serializable>{

}
