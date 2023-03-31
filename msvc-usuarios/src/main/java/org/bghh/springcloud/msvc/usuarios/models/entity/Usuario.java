package org.bghh.springcloud.msvc.usuarios.models.entity;

import jakarta.persistence.*;

@Entity
//Si no se define esta anotación por defecto el nombre de la tabla es el nom,bre de la clase
@Table(name="usuarios")
public class Usuario {
    //Agregamos la PK
    @Id
    //Autoincrementable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Si no tiene anotación por defecto es una columna normal
    //Si en la tabla tiene un nombre diferente al colocado en la variable
    //Hay que agregarle la anotación de column
    @Column(name = "nombre")
    private String nombre;
}
