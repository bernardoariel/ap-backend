package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.bolsadeideas.springboot.app.models.entity.Educacion;

public interface IEducacionDao extends CrudRepository<Educacion, Long> {
    
    
}
