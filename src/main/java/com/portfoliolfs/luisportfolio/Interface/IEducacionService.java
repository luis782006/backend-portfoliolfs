/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfoliolfs.luisportfolio.Interface;

import com.portfoliolfs.luisportfolio.entity.Educacion;
import java.util.List;

/**
 *
 * @author LuisPc
 */
public interface IEducacionService {
        
    public List<Educacion> getEducacion();
    
    public void saveEducacion(Educacion educacion);
    
    public void deleteEducacion(Long id);
    
    public Educacion findEducacion(Long id);
}
