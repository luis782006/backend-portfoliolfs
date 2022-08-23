/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliolfs.luisportfolio.Service;

import com.portfoliolfs.luisportfolio.Interface.IProyectoService;
import com.portfoliolfs.luisportfolio.entity.Proyecto;
import com.portfoliolfs.luisportfolio.repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectoService implements IProyectoService{

    @Autowired IProyectoRepository iProyectoRepository;
    
    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyecto=iProyectoRepository.findAll();
        return proyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        iProyectoRepository.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
        iProyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proyecto=iProyectoRepository.findById(id).orElse(null);
        return proyecto;
    }
    
}
