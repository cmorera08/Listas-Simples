/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listassimples;

/**
 *
 * @author Clarissa
 */
public class Metodos {
    public Cliente inicio, fin;//Mantiene el principio de la lista
    
        public boolean insertarFinal(int edad, String nombre, int cedula, String provincia){ 
            Cliente nuevoCliente = new Cliente(edad, nombre, cedula, provincia);
            if (inicio == null){ //Lista vacía?
                inicio = fin = nuevoCliente;
                return true;
            }
            fin.sig = nuevoCliente;
            fin = nuevoCliente;
            return true;
    }
}
