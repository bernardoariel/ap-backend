package com.bolsadeideas.springboot.app.models.services;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Trabajo;

public interface ITrabajoService {
    
    public List<Trabajo> findAll();

    public Trabajo findById(Long id);

    public Trabajo save (Trabajo trabajo);

    public void delete(Long id);
}
