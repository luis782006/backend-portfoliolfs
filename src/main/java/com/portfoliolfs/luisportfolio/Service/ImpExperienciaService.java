/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliolfs.luisportfolio.Service;

import com.portfoliolfs.luisportfolio.Interface.IExperienciaService;
import com.portfoliolfs.luisportfolio.entity.Experiencia;
import com.portfoliolfs.luisportfolio.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaService implements IExperienciaService{

    @Autowired IExperienciaRepository iExperienciaRepository;
            
    @Override
    public List<Experiencia> getExperiencia() {
       List<Experiencia> experiencia=iExperienciaRepository.findAll();
          return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        iExperienciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        iExperienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia=iExperienciaRepository.findById(id).orElse(null);
        return experiencia;
    }
    
}
