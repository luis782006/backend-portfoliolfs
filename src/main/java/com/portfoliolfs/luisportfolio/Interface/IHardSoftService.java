/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfoliolfs.luisportfolio.Interface;

import com.portfoliolfs.luisportfolio.entity.HardSoft;
import java.util.List;

/**
 *
 * @author LuisPc
 */
public interface IHardSoftService {
    
    public List<HardSoft> getHardSoft();
    
    public void saveHardSoft(HardSoft hardsoft);
    
    public void deleteHardSoft(Long id);
    
    public HardSoft findHardSoft(Long id);
    
    
}
