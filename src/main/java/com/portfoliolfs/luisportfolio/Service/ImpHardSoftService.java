/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliolfs.luisportfolio.Service;


import com.portfoliolfs.luisportfolio.Interface.IHardSoftService;
import com.portfoliolfs.luisportfolio.entity.HardSoft;
import com.portfoliolfs.luisportfolio.repository.IHardSoftRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpHardSoftService implements IHardSoftService{

    @Autowired IHardSoftRepository iHardSoftRepository;
    
    @Override
    public List<HardSoft> getHardSoft() {
        List<HardSoft> hardsoft=iHardSoftRepository.findAll();
        return hardsoft;
    }

    @Override
    public void saveHardSoft(HardSoft hardsoft) {
        iHardSoftRepository.save(hardsoft);
    }

    @Override
    public void deleteHardSoft(Long id) {
        iHardSoftRepository.deleteById(id);
    }

    @Override
    public HardSoft findHardSoft(Long id) {
        HardSoft hardsoft=iHardSoftRepository.findById(id).orElse(null);
        return hardsoft;
    }
    
}
