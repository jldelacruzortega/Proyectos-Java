/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicogui;

import com.itla.consultoriomedicobusiness.entity.Medico;
import com.itla.consultoriomedicobusiness.entity.Paciente;
import com.itla.consultoriomedicobusiness.enums.RepositoryEnum;
import com.itla.consultoriomedicobusiness.repository.MedicoRepository;
import com.itla.consultoriomedicobusiness.repository.PacienteRepository;
import com.itla.consultoriomedicobusiness.repository.factory.ApplicationContext;

/**
 *
 * @author JoseLuis
 */
public class Main {
    
    
    public static void main(String[] args) {

        Paciente paciente = new Paciente();
        paciente.setNombre("Juan");
        paciente.setApellido("Martinez");
        paciente.setCedula("0001-0433661-8");
        paciente.setEdad(30);
        paciente.setTelefono("809-555-5555"); 
              

        PacienteRepository pacienteRepository = (PacienteRepository) ApplicationContext.getRePository(RepositoryEnum.PACIENTE_REPOSITORY);
        pacienteRepository.save(paciente);
       
        
        Medico medico = new Medico();
        medico.setNombre("Jose");
        medico.setApellido("Perez");
        medico.setEspecialidad("Cirujano");
        medico.setExequatur("007");
        medico.setInstitucion("CENTRO MEDICO UCE"); 
        medico.setDireccion("Mama Tingo");
        medico.setTelefono("809-221-0007");
              

        MedicoRepository medicoRepository = (MedicoRepository) ApplicationContext.getRePository(RepositoryEnum.MEDICO_REPOSITORY);
        medicoRepository.save(medico);
        
        
        
        System.out.println(paciente.toString());
        System.out.println(medico.toString());
}
    

}