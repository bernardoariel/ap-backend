package com.bolsadeideas.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.ITrabajoDao;
import com.bolsadeideas.springboot.app.models.entity.Trabajo;

@Service
public class TrabajoServiceImpl implements ITrabajoService{
    
    @Autowired
	private ITrabajoDao trabajoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Trabajo> findAll() {
        
        return (List<Trabajo>) trabajoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Trabajo findById(Long id) {
        
        return trabajoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Trabajo save(Trabajo trabajo) {
        
        return trabajoDao.save(trabajo);
    }

    @Override
    @Transactional
    public void delete(Long id) {
       
        trabajoDao.deleteById(id);
        
    }

}
