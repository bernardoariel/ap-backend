package com.bolsadeideas.springboot.app.models.services;

import java.util.List;


import com.bolsadeideas.springboot.app.models.entity.Perfil;

public interface IPerfilService {
	
	public List<Perfil> findAll();
	
	public Perfil findById(Long id);
	
	public Perfil save(Perfil perfil);
	
	public void delete(Long id);

	
	
}
