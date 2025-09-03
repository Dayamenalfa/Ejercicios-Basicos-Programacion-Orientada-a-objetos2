/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocirculo;

/**
 *
 * @author ASUS
 */
public class Circulo {
    private double radio;
    
    //contrucor
    public Circulo(){
        this.radio = 0;
    }
    //metodos
        //setter y getter
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return this.radio;
    }
    
    public double calcularArea(){
        return Math.pow(this.radio, 2)*(Math.PI);
    }
   
    public double calcularCircunferencia(){
        return (this.radio)*(2)*(Math.PI);
    }
}
