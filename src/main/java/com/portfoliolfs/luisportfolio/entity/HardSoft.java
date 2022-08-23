/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliolfs.luisportfolio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author LuisPc
 */
// dependencia Lombok
    @Getter 
    @Setter
    // dependencia Lombok
    @Entity// se declara con la anotacion como entidad
    @Table(name="hardsoft") // se declara la tabla de la bd. en este caso Persona
    public class HardSoft {
         // se pasa a declarar cada columna de la tabla persona
    @Id 
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY) //se le dice que es la llave primary
    private Long id; 
   
    @Column
    @NotNull
    @Size(min=1, max=50, message="No cumple con el requerimiento Min=1, Max=10") // dependencia Validacion
    private String tipo_habilidad;

    @Column
    @NotNull
    private Integer nivel;
    
    //@Column
    //@NotNull
    //private String icono_url;

    public HardSoft() {
    }

    public HardSoft(Long id, String tipo_habilidad, Integer nivel) {
        this.id = id;
        this.tipo_habilidad = tipo_habilidad;
        this.nivel = nivel;
        //this.icono_url = icono_url; // agregar el parametro en el constructor si lo vamos a usar
    }
    
    
    
    }

