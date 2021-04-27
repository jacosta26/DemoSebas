package com.sebas.service;

import java.util.List;

import com.sebas.model.Persona;

public interface IPersonaServ {
	void registrarPersona(Persona persona);
	void actualizarPersona(Persona persona);
	void eliminarPersona(Persona persona);
	List<Persona> listarPersonar();
}
