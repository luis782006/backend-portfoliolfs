/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliolfs.luisportfolio.controller;

import com.portfoliolfs.luisportfolio.Interface.IHardSoftService;
import com.portfoliolfs.luisportfolio.entity.HardSoft;
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
public class HardSoftController {
    @Autowired IHardSoftService iHardSoftService;
    
    @GetMapping("/hardsoft/listar")
    public List<HardSoft> getHardSoft(){
       return iHardSoftService.getHardSoft();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/hardsoft/crear")
    public String createHardSoft(@RequestBody HardSoft hardsoft){
        iHardSoftService.saveHardSoft(hardsoft);
        return "";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/hardsoft/eliminar/{id}")
    public String deleteHardSoft(@PathVariable Long id){
        iHardSoftService.deleteHardSoft(id);
        return "";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/hardsoft/editar/{id}")
    public HardSoft hardsoft(@PathVariable Long id,
           @RequestBody HardSoft hardsoft) {                
           hardsoft.setId(id);
           iHardSoftService.saveHardSoft(hardsoft);
           return hardsoft;
    }  
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/hardsoft/buscar/{id}")
    public HardSoft hardsoft(@PathVariable Long id){
        return iHardSoftService.findHardSoft(id);
    }
    
    
  
            
}
