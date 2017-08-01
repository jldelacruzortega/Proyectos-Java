/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.entity;

import java.util.Comparator;

/**
 *
 * @author JoseLuis
 */
public class Paciente extends Persona {
    
    private String descripcion;
    private String cedula;
    private Integer edad;
    private String telefono;
    private Long codigo;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }    
         
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    

   
    
   @Override
    public String toString() {
        return  this.nombre + " " + this.apellido + " " + this.cedula + " " + this.descripcion + " " + this.edad + " " + this.telefono + " " + this.codigo + "";
    }
    
     public static Comparator<Paciente> NombresComparator = new Comparator<Paciente>() {

        @Override
        public int compare(Paciente o1, Paciente o2) {
            return o1.getNombre().compareTo(o2.getNombre());

        }
    };

    public static Comparator<Paciente> ApellidosComparator = new Comparator<Paciente>() {
        @Override
        public int compare(Paciente o1, Paciente o2) {
            return o1.getApellido().compareTo(o2.getApellido());

        }

    };

    @Override
    public boolean equals(Object object) {

        if (object instanceof Paciente) {
            Paciente paciente = (Paciente) object;

            if (this.nombre.equals(paciente.getNombre())
                    && this.apellido.equals(paciente.getApellido())
                    && this.edad.equals(paciente.getEdad())
                    && this.cedula.equals(paciente.getCedula())
                    && this.descripcion.equals(paciente.getDescripcion())
                    && this.telefono.equals(paciente.getTelefono())
                    && this.codigo.equals(paciente.getCodigo()))
                
                                                                {

                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        if (this.getNombre() != null
                && this.getApellido() != null
                && this.getEdad() != null
                && this.getCedula() != null
                && this.getDescripcion() != null
                && this.getTelefono() != null
                && this.getCodigo() != null) {
            return (int) 6 * this.nombre.length() + this.apellido.length() + this.edad.intValue() + this.cedula.length() + this.descripcion.length() + this.telefono.length() / this.codigo.intValue();
        }
        return 45;
    }

    
}
