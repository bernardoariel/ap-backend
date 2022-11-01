package com.bolsadeideas.springboot.app.models.services;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Porfolio;

public interface IPofolioService {
    
    public List<Porfolio> findAll();
}
