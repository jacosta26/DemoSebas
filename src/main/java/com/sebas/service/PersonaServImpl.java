package com.sebas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sebas.model.Persona;
import com.sebas.repository.IPersonaRepo;

@Service
public class PersonaServImpl implements IPersonaServ{
	@Autowired
	private IPersonaRepo iPersonaRepo;
	
	@Override
	public void registrarPersona(Persona persona) {
		// TODO Auto-generated method stub
		iPersonaRepo.save(persona);
	}
	
	@Override
	public void actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void eliminarPersona(Persona persona) {
		// TODO Auto-generated method stub
		iPersonaRepo.delete(persona);
	}
	
	@Override
	public List<Persona> listarPersonar() {
		// TODO Auto-generated method stub
		return iPersonaRepo.findAll();
	}
}
