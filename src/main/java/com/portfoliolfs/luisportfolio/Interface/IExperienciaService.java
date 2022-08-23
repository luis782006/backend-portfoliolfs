/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfoliolfs.luisportfolio.Interface;

import com.portfoliolfs.luisportfolio.entity.Experiencia;
import java.util.List;

/**
 *
 * @author LuisPc
 */
public interface IExperienciaService {
    //listar experiencia
    public List<Experiencia> getExperiencia();
    
    //agregar experiencia
    public void saveExperiencia(Experiencia experiencia);
    
    //eliminar experiencia
    public void deleteExperiencia(Long id);
    
    //buscar experiencia
    public Experiencia findExperiencia(Long id);
}
