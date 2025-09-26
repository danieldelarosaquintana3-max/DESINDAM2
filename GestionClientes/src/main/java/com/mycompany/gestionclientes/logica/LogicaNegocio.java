/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionclientes.logica;

import com.mycompany.gestionclientes.dto.Cliente;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class LogicaNegocio {
    private static List<Cliente> listaClientes =  new ArrayList();
    
    public static void addCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }
    
    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }
    public static void borrarCliente() {
        listaClientes.remove(0);
    }
    
}
