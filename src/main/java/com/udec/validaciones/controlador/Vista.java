/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.validaciones.controlador;

import com.udec.validaciones.modelo.Logica;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


/**
 * clase que se conecta con la parte web y brecibe datos de la logica
 * @author JUAN DAVID REYES
 * @author ALEJANDRO TORRES
 */
@Named(value = "vista")
@SessionScoped
public class Vista implements Serializable {
    /**
     * atributo nombre de la persona posteriormente se valida
     */
    private String nombre;
    /**
     * atributo edad de la persona posteriormente se valida
     */
    private String edad;
    /**
     * correo de la persona que posteriormente se valida
     */
    private String email;
    /**
     * telefono de la persona posteriormente se valida
     */
    private String telefono;
    /**
     * atribito fecha posteriormente se valida
     */
    private String fecha;
    /**
     * atributo moneda posteriormente se valida
     */
    private String moneda;
    /**
     * atributo guardar que es el boton escuchador que envia los datos
     */
    private String guardar;
    /**
     * llamado de la clase logica para usar sus metodos
     */
    Logica logica = new Logica();
  
    /**
     * constructor vacio de la clase
     */
    public Vista() {
    }
    /**
     * metodo vacio con la logica de la validacion 
     * de el nombre
     */
    public void nombre(){
        logica.nombre(nombre);
        setNombre(logica.getMostrar());
    }
    /**
     * metodo vacio con la logica de la validacion 
     * de la edad
     */
    public void edad(){
        logica.edad(edad);
        setEdad(logica.getMostrar());
    }
    /**
     * metodo vacio con la logica de la validacion 
     * de el correo
     */
    public void email(){
        logica.email(email);
        setEmail(logica.getMostrar());
    }
    /**
     * metodo vacio con la logica de la validacion 
     * de el telefono
     */
    public void telefono(){
        logica.telefono(telefono);
        setTelefono(logica.getMostrar());
    }
    /**
     * metodo vacio con la logica de la validacion 
     * de la fecha
     */
    public void fechas(){
        logica.fecha(fecha);
        setFecha(logica.getMostrar());
    }
    /**
     * metodo vacio con la logica de la validacion 
     * de la moneda
     */
    public void moneda(){
        logica.moneda(moneda);
        setMoneda(logica.getMostrar());
    }
   /**
    * metodo get que retorna el nombre de la persona
    * @return 
    */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodo set con el parametro nombre de la persona
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    * metodo get que retorna la edad de la persona
    * @return 
    */
    public String getEdad() {
        return edad;
    }
    /**
     * metodo get con el parametro edad de la persona
     * @param edad 
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }
    /**
    * metodo get que retorna el correode la persona
    * @return 
    */
    public String getEmail() {
        return email;
    }
    /**
     * metodo get con el parametro de el correo de la persona
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
    * metodo get que retorna el telefono de la persona
    * @return 
    */
    public String getTelefono() {
        return telefono;
    }
    /**
     * metodo get con el parametro telefono de la persona
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
    * metodo get que retorna la fecha a validar
    * @return 
    */
    public String getFecha() {
        return fecha;
    }
    /**
     * metodo get con el parametro fecha que se validara
     * @param fecha 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
    * metodo get que retorna la moneda a validar
    * @return 
    */
    public String getMoneda() {
        return moneda;
    }
    /**
     * metodo get con el parametro moneda que se validara
     * @param Moneda 
     */
    public void setMoneda(String Moneda) {
        this.moneda = moneda;
    }
    /**
     * metodo set que retorna la moneda validada
     * @return 
    */
    
     /**
     * metodo string que envia los metodos a la vista 
     * y retorna el string
     * @return 
     */
    public String getGuardar() {
        nombre();
        edad();
        telefono();
        email();
        fechas();
        moneda();
        return "";
    }
    /**
     * metodo set con el boton guardar 
     * @param guardar 
     */
    public void setGuardar(String guardar) {
        this.guardar = guardar;
    }
    
}
