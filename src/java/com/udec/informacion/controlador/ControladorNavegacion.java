/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.informacion.controlador;
 
import com.udec.informacion.modelo.Logica;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 *@author JUAN DAVID REYES
 *@author ALEJANDRO TORRES
 */
@ManagedBean
@RequestScoped
public class ControladorNavegacion  implements Serializable{ //escucha los eventos de algun boton
   /**
    * declaracion de variables
    */
    private String nombre;
    /**
     * atributo nombre
     */
    private String apellido;
    /**
     * atributo apellido
     */
    private String profesion;
    /**
     * atributo profecion
     */
    private char genero;
    /**
     * atributo genero
     */
    private String ubicacion;
    /**
     * atributo con la ubicacion
     */
    private int diastrabajados;
    /**
     * atributo con el idioma
     */
    private String [] idioma;
    
    /**
     * objeto de la clase logica
     */
    Logica logica = new Logica(nombre,apellido,profesion,genero,ubicacion,diastrabajados, idioma);
    /**
     * constructor de la clase
     */
    public ControladorNavegacion()  {
        
    }
    /**
     * metodo que retorna profecion
     * @return 
     */
    public String getProfesion() {
        return profesion;
    }
    /**
     * metodo con el parametro profesion
     * @param profesion 
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    /**
     * metodo que retorna el genero
     * @return 
     */
    public char getGenero() {
        return genero;
    }
    /**
     * metodo con el parametro genero
     * @param genero 
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }
    /**
     * metodo que retorna el apellido
     * @return 
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * petodo con el parametro apellido
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * metodo que retorna el nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodo con el parametro nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo que retorna el nombre
     * @return 
     */
    public String getUbicacion() {
        return ubicacion;
    }
    /**
     * metodo con el parametro ubicacion
     * @param ubicacion 
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

   /**
    * metodo con los dias de trabajo
    * @return 
    */

    public int getDiastrabajados() {
        return diastrabajados;
    }
    /**
     * metodo con e parametro de dias trabajados
     * @param diastrabajados 
     */
    public void setDiastrabajados(int diastrabajados) {
        this.diastrabajados = diastrabajados;
    }
    /**
     * metodo que retorna el idioma
     * @return 
     */
    public String[] getIdioma() {
        return idioma;
    }
    /**
     * metodo con el parametro idioma
     * @param idioma 
     */
    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }
    /**
     * metodo que retorna el objeto logica
     * @return 
     */
    public Logica getLogica() {
        return logica;
    }
   /**
    * metodo con el onjeto loigica
    * @param logica 
    */
    public void setLogica(Logica logica) {
        this.logica = logica;
    }

    
    
   
}
