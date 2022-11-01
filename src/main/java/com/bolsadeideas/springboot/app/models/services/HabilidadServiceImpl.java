package com.bolsadeideas.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IHabilidadDao;
import com.bolsadeideas.springboot.app.models.entity.Habilidad;

@Service
public class HabilidadServiceImpl implements IHabilidadService{

    @Autowired
    private IHabilidadDao habilidadDao;

    @Override
    @Transactional(readOnly = true)
    public List<Habilidad> findAll() {
        
        return (List<Habilidad>) habilidadDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Habilidad findById(Long id) {
       
        return habilidadDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Habilidad save(Habilidad habilidad) {
        
        return habilidadDao.save(habilidad);
    }

    @Override
    public void delete(Long id) {
        
        habilidadDao.deleteById(id);
    }
    
}
