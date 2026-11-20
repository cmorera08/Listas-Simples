/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listassimples;

/**
 *
 * @author Clarissa
 */
public class Cliente {
    int edad;
    String nombre;
    int cedula;
    String provincia;
    Cliente sig;
    public Cliente (int edad, String nombre, int cedula, String provincia){
        this.edad = edad;
        this.nombre = nombre;
        this.cedula = cedula;
        this.provincia = provincia;
        sig = null;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getCedula () {
        return cedula;
    }
    
    public String getProvincia() {
        return provincia;
    }

    public Cliente getSig() {
        return sig;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCedula (int cedula) {
        this.cedula = cedula;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setSig(Cliente sig) {
        this.sig = sig;
    }
    
}
