/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciolibro;

/**
 *
 * @author ASUS
 */
public class Libro {
    private String titulo, editorial, nomAutor, apeAutor;
    private int publicacion;
    private double precio;
    
    
   public Libro(){
       this.titulo="Cien años de soledad";
       this.editorial="Editorial Sudamericana";
       this.nomAutor="Gabriel";
       this.apeAutor="Garcia Marquez";
       this.publicacion=1967;
       this.precio=35000;
   }
   
   //setters y getters
  
  public void setTitulo(String titulo){
      this.titulo = titulo;
  }
  public void setEditorial(String editorial){
      this.editorial = editorial;
  }
  public void setNomAutor(String nomAutor){
      this.nomAutor= nomAutor;
  }
   public void setApeAutor(String apeAutor){
      this.apeAutor= apeAutor;
  }
   public void setPublicacion(int publicacion){
       this.publicacion = publicacion;
   }
   public void setPrecio(double precio){
       this.precio= precio;
   }
    
   
   public String getTitulo(){
       return this.titulo;
   }
   public String getEditorial(){
       return this.editorial;    
   }
   public String getNomAutor(){
       return this.nomAutor;
   }
   public String getApeAutor(){
       return this.apeAutor;
   }
   public int getPublicacion(){
       return this.publicacion;
   }
   public double getPrecio(){
       return this.precio;
   }
   
   public Double aplicarDescuento(){
       return this.precio + (this.precio*0.15);
   }
   
   public String obtenerInicialesAutor() {
        String nombreCompleto = nomAutor + " " + apeAutor;
        String[] partes = nombreCompleto.split(" ");
        String iniciales = "";

        for (int i = 0; i < partes.length; i++) {
            if (!partes[i].isEmpty()) {
                iniciales += Character.toUpperCase(partes[i].charAt(0)); // siempre mayúscula
                iniciales += "."; 
            }
        }
        return iniciales.trim();
        }
   
   
        
        
   
 
   
}
