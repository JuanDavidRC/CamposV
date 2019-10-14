/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.informacion.modelo;

import com.udec.informacion.controlador.ControladorNavegacion;

/**
 *
 *@author JUAN DAVID REYES
 *@author ALEJANDRO TORRES
 */

public class Logica {
    /**
     * atributo con el nombre de la persona
     */
    private String nombre;
    /**
     * atributo con el apellido
     */
     private String apellido;
     /**
      * atributo con la profecio
      */
      private String profesion;
      /**
       * atributo con el genero que este en combox
       */
     private char genero;
     /**
      * atributo con el generoi
      */
    private String ubicacion;
    /**
     * atributo con la ubicacion de la persona
     */
    
    public int diasTrabajados;
    /**
     * atributo de tipo entero  con los dias de el trabajador
     */
    private String [] idioma;
    /**
     * atributo tipo string con el idioma de la persona
     */
    
    private ControladorNavegacion control;
    /**
     * constructor de la clase 
     * @param nombre
     * @param apellido
     * @param profesion
     * @param genero
     * @param ubicacion
     * @param diasTrabajados
     * @param idioma 
     */
    public Logica(String nombre,String apellido,String profesion,char genero, String ubicacion, int diasTrabajados, String [] idioma) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.diasTrabajados = diasTrabajados;
        this.idioma= idioma;
        
    }
    /**
     * metodo que retorna profesion
     * @return 
     */

    public String getProfesion() {
        return profesion;
    }
    /**
     * metodo con el parametro
     * @param profesion 
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    /**
     * metodo que retirna el genero
     * @return 
     */
    public char getGenero() {
        return genero;
    }
    /**
     * metodo con el parametro genro
     * @param genero 
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }
    /**
     * metodo que retorna el nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodo con el parametro
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo que retorna el nombre
     * @return 
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * metodo con el parametro apellido
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * metodo que retorna la ubicacion
     * @return 
     */
    public String getUbicacion() {
        return ubicacion;
    }
    /**
     * metodo con el parametro
     * @param ubicacion 
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    /**
     * metodo que retorna los dias
     * @return 
     */

    public int getDiasTrabajados() {
        return diasTrabajados;
    }
    /**
     * metodo con el parametro
     * @param diasTrabajados 
     */
    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }
    /**
     * metodo que retorna el idioma
     * @return 
     */
    public String []getIdioma() {
        return idioma;
    }
    /**
     * metodo con el parametro
     * @param idioma 
     */
    public void setIdioma(String [] idioma) {
        this.idioma = idioma;
    }
    
    
   /**
    * metodo que calcula el valor de la cuenta de la persona
    * @param Sueldo
    * @param profesion
    * @param diasTrabajdos
    * @param idioma
    * @return 
    */
   public int Total(String Sueldo,String profesion, int diasTrabajdos, String [] idioma ){
       
       int totalfinal=0;
       int sueldo =0;
       if (profesion.contains("Ingeniero")){
           sueldo = 2000000;
       }
       if (profesion.contains("Tecnologo")){
           sueldo = 1500000;
       }
       if (profesion.contains("Tecnico")){
           sueldo = 1000000;
       }
       if (profesion.contains("Auxiliar")){
           sueldo = 850000;
       }
        
                     
                      for(int i=0; i< idioma.length ;i++){
                          if(idioma[i].equals("ingles")){
                              totalfinal= totalfinal + 250000;
                              
                          }else if(idioma[i].equals("frances")){
                              totalfinal= totalfinal + 350000;
                          }else if(idioma[i].equals("aleman"))
                          {
                              totalfinal= totalfinal + 500000;
                          } 
                      }

    
       sueldo = sueldo*(diasTrabajados);
        totalfinal = totalfinal + sueldo;
       return totalfinal;
   }
    
    
}
