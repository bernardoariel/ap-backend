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

import com.bolsadeideas.springboot.app.models.entity.Habilidad;
import com.bolsadeideas.springboot.app.models.services.IHabilidadService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/")
public class HabilidadApiRestController {

    @Autowired
    private IHabilidadService habilidadService;

    @GetMapping("/habilidad")
    @ResponseStatus(HttpStatus.OK)
    public List<Habilidad> index(){

        return habilidadService.findAll();
    }

    @GetMapping("habilidad/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Habilidad show(@PathVariable Long id){
        return habilidadService.findById(id);
    }

    @PostMapping("/habilidad")
    @ResponseStatus(HttpStatus.CREATED)
    public Habilidad create(@RequestBody Habilidad habilidad){
        return habilidadService.save(habilidad);
    }

    @PutMapping("/habilidad/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Habilidad update (@RequestBody Habilidad habilidad,@PathVariable Long id){

        Habilidad habilidadActual = habilidadService.findById(id);

        habilidadActual.setNombre(habilidad.getNombre());
        habilidadActual.setPorcentaje(habilidad.getPorcentaje());
        habilidadActual.setDescripcion(habilidad.getDescripcion());

        return habilidadService.save(habilidadActual);

    }


    @DeleteMapping("/habilidad/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        habilidadService.delete(id);
    }
}
