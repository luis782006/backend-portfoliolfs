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
    @Table(name="experiencias") // se declara la tabla de la bd. en este caso Persona
    public class Experiencia {
         // se pasa a declarar cada columna de la tabla persona
    @Id 
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY) //se le dice que es la llave primary
    private Long id; 
   
    @Column
    @NotNull
    @Size(min=1, max=50, message="No cumple con el requerimiento Min=1, Max=50") // dependencia Validacion
    private String nombre_empresa;

    @Column
    private String inicio_empresa;
    
    @Column
    private String fin_empresa;
    
    @Column
    @NotNull
    @Size(min=1, max=350, message="No cumple con el requerimiento Min=1, Max=350")
    private String descripcion_empresa;
    
    @Column
    private String photo_url_empresa;

    public Experiencia() {
    }

    public Experiencia(Long id, String nombre_empresa, String inicio_empresa, String fin_empresa, String descripcion_empresa, String photo_url_empresa) {
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.inicio_empresa = inicio_empresa;
        this.fin_empresa = fin_empresa;
        this.descripcion_empresa = descripcion_empresa;
        this.photo_url_empresa = photo_url_empresa;
    }
    
    
    
    }

