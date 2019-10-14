/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.informacion.controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;

/**
 *
 *@author JUAN DAVID REYES
 *@author ALEJANDRO TORRES
 */
@ManagedBean
@RequestScoped
public class Mostrar implements Serializable {
     /**
      * anotacion para llamar los datos de la clase logica
      */
    @ManagedProperty("#{controladorNavegacion}")
  
    /**
     * atributos de la clase
     */
    private ControladorNavegacion controlador;
    /**
     * constructor vacio de la clase
     */
    public Mostrar() {
    }
    /**
     * metodo que retorna el controldaro
     * @return 
     */
    public ControladorNavegacion getControlador() {
        return controlador;
    }
   /**
    * metodo con el parametro de el controladaro
    * @param controlador 
    */
    public void setControlador(ControladorNavegacion controlador) {
        this.controlador = controlador;
    }
    
    /**
     * metodo retorna string y los muesta en en la seguda vista
     * @return 
     */
    
    public String MostrarInformacion(){
        return "Tu Nombre es:"+controlador.getNombre()+ ","   +
                "Tu Apellido es:"+controlador.getApellido()+ ","   +
                 "Tu Profesion  es:"+controlador.getProfesion()+ ","   +
                 "Tu Genero es:"+controlador.getGenero()+ ","   +
                "\nTu ubicacion es :"+ controlador.getUbicacion()+  ",\n"   +  
                "\nTus Dias Trabajados son:" +controlador.getDiastrabajados()+ ",\n"   +
                "\nTus idiomas:"+ controlador.getIdioma().length +   ",\n"   +
                "\nTu sueldo total es:"+ controlador.logica.Total(controlador.getUbicacion(),controlador.getProfesion(), controlador.getDiastrabajados(), controlador.getIdioma());
        
    }
    
}
