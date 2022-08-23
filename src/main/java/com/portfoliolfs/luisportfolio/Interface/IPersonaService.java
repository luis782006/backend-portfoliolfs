/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfoliolfs.luisportfolio.Interface;

import com.portfoliolfs.luisportfolio.entity.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> getPersona();
    
    //Guardar persona
    public void savePersona(Persona persona);
    
    //Eliminar persona segun id
    public void deletePersona(Long id);
    
    //Encontrar persona segun id
    public Persona findPersona(Long id);

    
   
}
