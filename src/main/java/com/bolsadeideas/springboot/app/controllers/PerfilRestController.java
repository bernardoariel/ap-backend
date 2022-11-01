package com.bolsadeideas.springboot.app.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.app.models.entity.Perfil;

import com.bolsadeideas.springboot.app.models.services.IPerfilService;

@CrossOrigin(origins = {"**"})
@RestController
@RequestMapping("/")
public class PerfilRestController {
	
	@Autowired
	private IPerfilService perfilService;
	
	/* trae el perfil */
	@GetMapping("/perfil/{id}")
	public Perfil show(@PathVariable Long id) {
		return perfilService.findById(id);
	}
	
	@PostMapping("/perfil")
	@ResponseStatus(HttpStatus.CREATED)
	public Perfil create(@RequestBody Perfil perfil) {
	
		return perfilService.save(perfil);
	}
	
	@PutMapping("/perfil/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Perfil update(@RequestBody Perfil perfil, @PathVariable Long id) {
		
		Perfil perfilActual = perfilService.findById(id);
		perfilActual.setApellido(perfil.getApellido());
		perfilActual.setNombre(perfil.getNombre());
		perfilActual.setEmail(perfil.getEmail());
		perfilActual.setMensaje(perfil.getMensaje());
		perfilActual.setFoto(perfil.getFoto());
		
		return perfilService.save(perfilActual);
	}
	
	
}
