package com.sebas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebas.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
