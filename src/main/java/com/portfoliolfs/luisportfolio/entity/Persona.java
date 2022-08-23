package com.portfoliolfs.luisportfolio.entity;

import java.io.Serializable;
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
    @Table(name="personas") // se declara la tabla de la bd. en este caso Persona
    public class Persona {
         // se pasa a declarar cada columna de la tabla persona
    @Id 
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY) //se le dice que es la llave primary
    private Long id; 
   
    @Column
    @NotNull
    private String nombre;

    @Column
    @NotNull
    private String apellido;
    
    @Column
    @NotNull
    private String descripcion_acerca; 
    
    @Column
    @NotNull
    private String photo_url;
    
    @Column
    private String path_git;
    
    @Column
    private String path_link;
    
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String descripcion_acerca, String photo_url, String path_git, String path_link) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion_acerca = descripcion_acerca;
        this.photo_url = photo_url;
        this.path_git = path_git;
        this.path_link = path_link;
    }

   

 
    
    
    }
