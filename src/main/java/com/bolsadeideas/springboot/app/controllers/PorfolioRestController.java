package com.bolsadeideas.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.app.models.entity.Porfolio;
import com.bolsadeideas.springboot.app.models.services.IPorfolioService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/")
public class PorfolioRestController {
    
    @Autowired
    private IPorfolioService porfolioService;
    
    @GetMapping("/porfolio")
    @ResponseStatus(HttpStatus.OK)
    public List<Porfolio> index(){

        return porfolioService.findAll();
    }

    @GetMapping("porfolio/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Porfolio show(@PathVariable Long id){
        return porfolioService.findById(id);
    }

    @PostMapping("/porfolio")
    @ResponseStatus(HttpStatus.CREATED)
    public Porfolio create(@RequestBody Porfolio porfolio){
        return porfolioService.save(porfolio);
    }

    @PutMapping("/porfolio/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Porfolio update (@RequestBody Porfolio porfolio,@PathVariable Long id){

        Porfolio porfolioActual = porfolioService.findById(id);

        porfolioActual.setNombre(porfolio.getNombre());
        porfolioActual.setBackUrl(porfolio.getBackUrl());
        porfolioActual.setDemoUrl(porfolio.getDemoUrl());
        porfolioActual.setDescripcion(porfolio.getDescripcion());
        porfolioActual.setFecha(porfolio.getFecha());
        porfolioActual.setFrontUrl(porfolio.getFrontUrl());
        porfolioActual.setImagen(porfolio.getImagen());

        return porfolioService.save(porfolioActual);

    }

    @DeleteMapping("/porfolio/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        porfolioService.delete(id);
    }

}
