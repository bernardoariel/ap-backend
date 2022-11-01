package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entity.Habilidad;

public interface IHabilidadDao extends CrudRepository<Habilidad, Long>{
    
}
