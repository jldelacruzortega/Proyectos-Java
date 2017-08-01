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
public class Medico extends Persona {
    
    private Long codigo;
    private String especialidad;
    private String universidad;
    private String exequatur;
    private String institucion;
    private String direccion;
    private String telefono;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
        

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getExequatur() {
        return exequatur;
    }

    public void setExequatur(String exequatur) {
        this.exequatur = exequatur;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String instititucion) {
        this.institucion = instititucion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " " + this.codigo + " " + this.especialidad + " " + this.universidad + " " + this.exequatur
                + " " + this.institucion + " " + this.direccion + " " + this.telefono ;
    }
    
    public static Comparator<Medico> NombresComparator = new Comparator<Medico>() {

        @Override
        public int compare(Medico o1, Medico o2) {
            return o1.getNombre().compareTo(o2.getNombre());

        }
    };

    public static Comparator<Medico> ApellidosComparator = new Comparator<Medico>() {
        
        @Override
        public int compare(Medico o1, Medico o2) {
            return o1.getApellido().compareTo(o2.getApellido());

        }

    };

    public boolean equals(Object object) {

        if (object instanceof Medico) {
            Medico medico = (Medico) object;

          if (this.nombre.equals(medico.getNombre())
                    && this.apellido.equals(medico.getApellido())
                    && this.codigo.equals(medico.getCodigo())
                    && this.exequatur.equals(medico.getExequatur())
                    && this.especialidad.equals(medico.getEspecialidad())
                    && this.institucion.equals(medico.getInstitucion())
                    && this.direccion.equals(medico.getDireccion())
                    && this.telefono.equals(medico.getTelefono()))
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
                && this.getCodigo() != null
                && this.getExequatur() != null
                && this.getEspecialidad() != null
                && this.getInstitucion() != null
                && this.getDireccion() != null
                && this.getTelefono() != null) {
            return (int) 7 * this.nombre.length() + this.apellido.length() + this.codigo.intValue()+ this.exequatur.length() + this.especialidad.length() + this.institucion.length()+ this.direccion.length() / this.telefono.length();
        }
        return 45;
    }

}
