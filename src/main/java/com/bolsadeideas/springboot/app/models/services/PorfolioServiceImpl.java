package com.bolsadeideas.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IPorfolioDao;
import com.bolsadeideas.springboot.app.models.entity.Porfolio;

@Service
public class PorfolioServiceImpl implements IPorfolioService{
    
    @Autowired
    private IPorfolioDao porfolioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Porfolio> findAll(){
        return (List<Porfolio>) porfolioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Porfolio findById(Long id) {
       
        return porfolioDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Porfolio save(Porfolio porfolio) {
        
        return porfolioDao.save(porfolio);
    }

    @Override
    @Transactional
    public void delete(Long Id) {
        
        porfolioDao.deleteById(Id);
        
    }
}
