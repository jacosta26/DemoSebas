package com.sebas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sebas.model.Persona;
import com.sebas.service.IPersonaServ;

@Controller
public class DemoController {
	@Autowired
	private IPersonaServ iPersonaServ;
	
	@GetMapping("/saludo")
	public String saludando(@RequestParam(name="nombre", required=false, defaultValue="Mundo") String nombreASaludar, Model model) {
		Persona persona = new Persona();
		persona.setNombres(nombreASaludar);
		persona.setApellidoPaterno("Acosta");
		persona.setApellidoMaterno("Meca");
		iPersonaServ.registrarPersona(persona);
		model.addAttribute("nombreA", nombreASaludar);
		return "Saludos";
	}
	
	@GetMapping("/listar")
	public String listandoPersonas(Model model) {
		model.addAttribute("personas", iPersonaServ.listarPersonar());
		return "ListadoPersona";
	}
}
