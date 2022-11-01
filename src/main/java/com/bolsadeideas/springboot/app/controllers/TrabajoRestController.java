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

import com.bolsadeideas.springboot.app.models.entity.Trabajo;
import com.bolsadeideas.springboot.app.models.services.ITrabajoService;



@CrossOrigin(origins = {"**"})
@RestController
@RequestMapping("/")
public class TrabajoRestController {
    
    @Autowired
    private ITrabajoService trabajoService;

    @GetMapping("/trabajo")
    @ResponseStatus(HttpStatus.OK)
    public List<Trabajo> index(){

        return trabajoService.findAll();
    }

    @GetMapping("/trabajo/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Trabajo show(@PathVariable Long id){
        return trabajoService.findById(id);
    }

    @PostMapping("/trabajo")
    @ResponseStatus(HttpStatus.CREATED)
    public Trabajo create(@RequestBody Trabajo trabajo){
        return trabajoService.save(trabajo);
    }

    @PutMapping("/trabajo/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Trabajo update (@RequestBody Trabajo trabajo,@PathVariable Long id){

        Trabajo trabajoActual = trabajoService.findById(id);

        trabajoActual.setTitulo(trabajo.getTitulo());
        trabajoActual.setInstitution(trabajo.getInstitution());
        trabajoActual.setStartDate(trabajo.getStartDate());
        trabajoActual.setEndDate(trabajo.getEndDate());
        trabajoActual.setImagen(trabajo.getImagen());
        trabajoActual.setDescripcion(trabajo.getDescripcion());

        return trabajoService.save(trabajoActual);

    }

    @DeleteMapping("/trabajo/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        trabajoService.delete(id);
    }

}
