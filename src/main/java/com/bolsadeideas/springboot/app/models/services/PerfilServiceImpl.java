package com.bolsadeideas.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.bolsadeideas.springboot.app.models.dao.IPerfilDao;

import com.bolsadeideas.springboot.app.models.entity.Perfil;


@Service
public class PerfilServiceImpl implements IPerfilService{
	
	@Autowired
	private IPerfilDao perfilDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Perfil> findAll() {
		
		return (List<Perfil>) perfilDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Perfil findById(Long id) {
	
		return perfilDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Perfil save(Perfil perfil) {
		
		return perfilDao.save(perfil);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		
		perfilDao.deleteById(id);
	}



}
