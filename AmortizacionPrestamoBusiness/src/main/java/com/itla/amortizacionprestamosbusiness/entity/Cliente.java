/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.amortizacionprestamosbusiness.entity;

/**
 *
 * @author JoseLuis
 */
public class Cliente extends Persona{
    
    protected Long id;
    protected String cedula;
    protected String telefono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

  
    

    @Override
    public String toString() {
       
        return ""+nombre+" "+apellido+" "+id+" "+cedula+" "+telefono+"";

    }
    
    
    
}
