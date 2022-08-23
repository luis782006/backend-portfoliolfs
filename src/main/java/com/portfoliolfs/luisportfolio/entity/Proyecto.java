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
    @Table(name="proyectos") // se declara la tabla de la bd. en este caso Persona
    public class Proyecto {
         // se pasa a declarar cada columna de la tabla persona
    @Id 
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY) //se le dice que es la llave primary
    private Long id; 
   
    @Column
    @NotNull
    @Size(min=1, max=50, message="No cumple con el requerimiento Min=1, Max=50") // dependencia Validacion
    private String nombre_proyecto;

    @Column
    @NotNull
    @Size(min=1, max=350, message="No cumple con el requerimiento Min=1, Max=350") // dependencia Validacion
    private String descripcion_proyecto;
    
    @Column
    @NotNull
    private String link_url;
    
    @Column
    @NotNull
    private String photo_url;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre_proyecto, String descripcion_proyecto, String link_url, String photo_url) {
        this.id = id;
        this.nombre_proyecto = nombre_proyecto;
        this.descripcion_proyecto = descripcion_proyecto;
        this.link_url = link_url;
        this.photo_url = photo_url;
    }

    
    
    }


