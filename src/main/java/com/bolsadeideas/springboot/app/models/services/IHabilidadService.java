package com.bolsadeideas.springboot.app.models.services;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Habilidad;

public interface IHabilidadService {
    
    public List<Habilidad> findAll();

    public Habilidad findById(Long id);

    public Habilidad save(Habilidad habilidad);

    public void delete(Long id);
}
