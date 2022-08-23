/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliolfs.luisportfolio.Service;

import com.portfoliolfs.luisportfolio.Interface.IPersonaService;
import com.portfoliolfs.luisportfolio.entity.Persona;
import com.portfoliolfs.luisportfolio.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImpPersonaService implements IPersonaService {
    
     @Autowired IPersonaRepository iPersonaRepository;
   
    @Override
    //trae todos los campos de la entidad persona
    public List<Persona> getPersona() {
         List<Persona> persona =iPersonaRepository.findAll();
               return persona;
    }
    //guarda el objecto persona
    @Override
    public void savePersona(Persona persona) {
       iPersonaRepository.save(persona);
    }
    
    //elimina el objeto persona segun id
    @Override
    public void deletePersona(Long id) {
       iPersonaRepository.deleteById(id);
    }
    
    //busca la un objeto persona por su nombre.
    @Override
    public Persona findPersona(Long id) {
        Persona persona=iPersonaRepository.findById(id).orElse(null);
        return persona;
    }

   
    
}
