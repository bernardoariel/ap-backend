package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entity.Porfolio;

public interface IPorfolioDao extends CrudRepository<Porfolio, Long> {
    
}
