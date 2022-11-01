package com.bolsadeideas.springboot.app.models.services;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Educacion;

public interface IEducacionService {
    
    public List<Educacion> findAll();

    public Educacion findById(Long id);

    public Educacion save(Educacion educacion);

    public void delete(Long id);
}
