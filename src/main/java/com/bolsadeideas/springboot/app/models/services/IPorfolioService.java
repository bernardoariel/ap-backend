package com.bolsadeideas.springboot.app.models.services;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Porfolio;

public interface IPorfolioService {
    
    public List<Porfolio> findAll();
    
    public Porfolio findById(Long id);
    
    public Porfolio save(Porfolio porfolio);

    public void delete(Long Id);



}
