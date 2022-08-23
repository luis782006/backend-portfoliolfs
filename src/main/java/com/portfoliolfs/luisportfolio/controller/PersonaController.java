/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliolfs.luisportfolio.controller;

import com.portfoliolfs.luisportfolio.Interface.IPersonaService;
import com.portfoliolfs.luisportfolio.entity.Persona;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class PersonaController {

    @Autowired
    IPersonaService ipersonaService;

    @GetMapping("/personas/listar") //este endpoint esta vinculado con el metodo getPersona declarado aqui.
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    @PreAuthorize("hasRole('ADMIN')")        
    @PostMapping("/personas/crear") // los parametros del objeto se pasan por json en postman.
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/eliminar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona persona(@PathVariable("id") Long id,
        @RequestBody Persona persona) {
        persona.setId(id);
        ipersonaService.savePersona(persona);
        return persona;
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/personas/buscar/{id}")
    public Persona persona(@PathVariable Long id) {
        return ipersonaService.findPersona(id);
        //return ipersonaService.findPersona(id);
    }

}
