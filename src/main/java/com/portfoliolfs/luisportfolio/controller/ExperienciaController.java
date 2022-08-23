/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliolfs.luisportfolio.controller;

import com.portfoliolfs.luisportfolio.Interface.IExperienciaService;
import com.portfoliolfs.luisportfolio.entity.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class ExperienciaController {
    @Autowired IExperienciaService iExperienciaService;
    
   @GetMapping("experiencia/listar") 
    public List<Experiencia> getExperiencia(){
    return iExperienciaService.getExperiencia();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
    iExperienciaService.saveExperiencia(experiencia);
    return "";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/experiencia/eliminar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
    iExperienciaService.deleteExperiencia(id);
    return "";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia experiencia(@PathVariable Long id,
        @RequestBody Experiencia experiencia){
        experiencia.setId(id);
        iExperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }
        
    @PreAuthorize("hasRole('ADMIN')")  
    @GetMapping("/experiencia/buscar/{id}")
    public Experiencia experiencia(@PathVariable Long id){
    return iExperienciaService.findExperiencia(id);
    }
                                   
}
