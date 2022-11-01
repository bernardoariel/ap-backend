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

import com.bolsadeideas.springboot.app.models.entity.Educacion;
import com.bolsadeideas.springboot.app.models.services.IEducacionService;

@CrossOrigin(origins = {"**"})
@RestController
@RequestMapping("/")
public class EducacionRestController {
    
    @Autowired
    private IEducacionService educacionService;

    @GetMapping("/educacion")
    @ResponseStatus(HttpStatus.OK)
    public List<Educacion> index(){

        return educacionService.findAll();
    }

    @GetMapping("educacion/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Educacion show(@PathVariable Long id){
        return educacionService.findById(id);
    }

    @PostMapping("/educacion")
    @ResponseStatus(HttpStatus.CREATED)
    public Educacion create(@RequestBody Educacion porfolio){
        return educacionService.save(porfolio);
    }

    @PutMapping("/educacion/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Educacion update (@RequestBody Educacion educacion,@PathVariable Long id){

        Educacion educacionActual = educacionService.findById(id);

        educacionActual.setTitulo(educacion.getTitulo());
        educacionActual.setInstitution(educacion.getInstitution());
        educacionActual.setStartDate(educacion.getStartDate());
        educacionActual.setEndDate(educacion.getEndDate());
        educacionActual.setImagen(educacion.getImagen());
        educacionActual.setDescripcion(educacion.getDescripcion());

        return educacionService.save(educacionActual);

    }

    @DeleteMapping("/educacion/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        educacionService.delete(id);
    }
}
