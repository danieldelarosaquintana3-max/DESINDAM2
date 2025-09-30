/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tablaabstracta.logica;

import com.mycompany.tablaabstracta.beans.Alumno;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class LogicaNegocio {
    public List<Alumno> listaAlumno =  new ArrayList<>();

    public LogicaNegocio() {
        listaAlumno = new ArrayList<>();
        
        listaAlumno.add(new Alumno("Enol","DAM"));
        listaAlumno.add(new Alumno("Daniel","DAW"));
        listaAlumno.add(new Alumno("Elena","ASIR"));
        
    }
    
    public List<Alumno> getListAlumno() {
        return this.listaAlumno;
    }
}
