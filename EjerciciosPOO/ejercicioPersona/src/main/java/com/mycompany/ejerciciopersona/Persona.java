/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopersona;


public class Persona {
    private String nombre;
    private int edad;
    private String correo;
    
    
    //constuctor
    
    public Persona(){
        this.nombre = "" ;
        this.correo = "";
        this.edad = 0;
    }
    //Metodos
        //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
        //getters
    public String getNombre(String nombre){
        return this.nombre;
    }
    public String getCorreo(String correo){
        return this.correo;
    }
    public int getEdad(int edad){
        return this.edad;
    }
   
    
    public String evaluarEdad(){
        if (this.edad < 18){
           return "Mayor de edad"; 
        } else{
            return "Menor de edad";
        }
    }
    
    public String validarCorreo(){
        if (this.correo.contains("@")) {
            return "El correo es válido";
        } else {
            return "El correo no es válido";
        }
    }
   
   
}
