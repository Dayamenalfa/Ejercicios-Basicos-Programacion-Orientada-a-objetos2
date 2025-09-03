/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioestudiante;

/**
 *
 * @author ASUS
 */
public class Estudiante {
    private String nombre;
    private long codigo;
    private double promedio;
    
    //constructor
    public Estudiante(){
        this.nombre ="";
        this.codigo =0;
        this.promedio= 0.0;
    }
    
    //setters y getters
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }
    
    public void setPromedio(double promedio){
        this.promedio = promedio;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public long getCodigo(){
        return this.codigo;
    }
    public double getPromedio(){
        return this.promedio;
    }
    
    //metodos
    public String validarEstado(){
        if (this.promedio >= 3){
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
    
    
   
    
}
