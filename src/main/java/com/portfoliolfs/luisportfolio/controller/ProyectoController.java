/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliolfs.luisportfolio.controller;

import com.portfoliolfs.luisportfolio.Interface.IProyectoService;
import com.portfoliolfs.luisportfolio.entity.Proyecto;
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
public class ProyectoController {
    @Autowired IProyectoService iProyectoService;
    
    @GetMapping("/proyecto/listar")
    public List<Proyecto> getProyecto(){
    return iProyectoService.getProyecto();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/proyecto/crear")
    public String createProyecto(@RequestBody Proyecto proyecto){
    iProyectoService.saveProyecto(proyecto);
    return "";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/proyecto/eliminar/{id}")
    public String deleteProyecto(@PathVariable Long id){
    iProyectoService.deleteProyecto(id);
    return "";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/proyecto/editar/{id}")
    public Proyecto proyecto(@PathVariable("id") Long id,
        @RequestBody Proyecto proyecto){
        proyecto.setId(id);
        iProyectoService.saveProyecto(proyecto);
        return proyecto;  
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/proyecto/buscar/{id}")
    public Proyecto proyecto(@PathVariable Long id){
     return iProyectoService.findProyecto(id);
    }
}
