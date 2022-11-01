package com.bolsadeideas.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IEducacionDao;
import com.bolsadeideas.springboot.app.models.entity.Educacion;

@Service
public class EducacionServiceImpl implements IEducacionService {

    @Autowired
	private IEducacionDao educacionDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Educacion> findAll() {
       
        return (List<Educacion>) educacionDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Educacion findById(Long id) {
        
        return educacionDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Educacion save(Educacion educacion) {
        
        return educacionDao.save(educacion);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        educacionDao.deleteById(id);
        
    }
    
}
