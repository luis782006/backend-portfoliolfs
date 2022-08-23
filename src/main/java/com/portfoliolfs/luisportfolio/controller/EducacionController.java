/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliolfs.luisportfolio.controller;

import com.portfoliolfs.luisportfolio.Interface.IEducacionService;
import com.portfoliolfs.luisportfolio.entity.Educacion;
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
public class EducacionController {
    
    @Autowired IEducacionService iEducacionService;
    
    @GetMapping("/educacion/listar")
    
    public List<Educacion> getEducacion(){
    return iEducacionService.getEducacion();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/educacion/crear")
    public String createEducacion(@RequestBody Educacion educacion){
    iEducacionService.saveEducacion(educacion);
    return "";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/educacion/eliminar/{id}")
    public String deleteEducacion(@PathVariable Long id){
        iEducacionService.deleteEducacion(id);
        return "";
    }
    @PreAuthorize("hasRole('ADMIN')") //protege la ruta y el metodo
    @PutMapping("/educacion/editar/{id}")
    public Educacion educacion(@PathVariable Long id,
        @RequestBody Educacion educacion){
        educacion.setId(id);
        iEducacionService.saveEducacion(educacion);
        return educacion;          
    }
     
    @GetMapping("/educacion/buscar/{id}")
    public Educacion educacion(@PathVariable Long id){
    return iEducacionService.findEducacion(id);
    }
}
