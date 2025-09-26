/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionclientes.dto;

import java.util.Date;

/**
 *
 * @author danie
 */
public class Cliente {
    private String  nombre ,apellidos ,provincia;
    private Date fecha;

    public Cliente(String nombre, String apellidos, String provincia, Date fecha) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.provincia = provincia;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", provincia=" + provincia + ", fecha=" + fecha + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getProvincia() {
        return provincia;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public String[] toArrayString() {
        String[] retorna =  new String[4];
        retorna[0] =  nombre;
        retorna[1] =  apellidos;
        retorna[2] =  fecha.toString();    
        retorna[3] =  provincia;
        return retorna;
    }
}
