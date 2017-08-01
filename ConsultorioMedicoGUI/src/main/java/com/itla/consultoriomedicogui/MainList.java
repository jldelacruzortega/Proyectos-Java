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
import java.util.Collections;

/**
 *
 * @author JoseLuis
 */
public class MainList {
    
    public static void main(String[] args){
        
        PacienteRepository pacienteRepository = (PacienteRepository) 
        ApplicationContext.getRePository(RepositoryEnum.PACIENTE_REPOSITORY);
        
        Paciente paciente1 = new Paciente();
        paciente1.setNombre("Jeimmy");
        paciente1.setApellido("Sosa");
        paciente1.setCedula("002-25384-0");
        paciente1.setEdad(30);
        paciente1.setTelefono("809-555-5555"); 
        paciente1.setCodigo(1L); 
        
        Paciente paciente2 = new Paciente();
        paciente2.setNombre("Eusebio");
        paciente2.setApellido("Vasquez");
        paciente2.setCedula("002-25384-0");
        paciente2.setEdad(60);
        paciente2.setTelefono("809-565-4545"); 
        paciente2.setCodigo(2L); 
        
        Paciente paciente3 = new Paciente();
        paciente3.setNombre("Polanco");
        paciente3.setApellido("Gomez");
        paciente3.setCedula("007-0007541-0");
        paciente3.setEdad(43);
        paciente3.setTelefono("849-333-000"); 
        paciente3.setCodigo(3L); 
        
        
        Paciente paciente4 = new Paciente();
        paciente4.setNombre("Paul");
        paciente4.setApellido("Walker");
        paciente4.setCedula("002-25384-0");
        paciente4.setEdad(30);
        paciente4.setTelefono("809-555-5555"); 
        paciente4.setCodigo(4L); 
        
        pacienteRepository.save(paciente1);
        pacienteRepository.save(paciente2);
        pacienteRepository.save(paciente3);
        pacienteRepository.save(paciente4);
        
        
        
        //Metodo para buscar Pacientes comparando por nombres
        Collections.sort(pacienteRepository.findAll(), Paciente.NombresComparator);
        System.out.println(pacienteRepository.findAll());

        Collections.sort(pacienteRepository.findAll(), Paciente.ApellidosComparator);
        System.out.println(pacienteRepository.findAll());
        
        
        
       
       
       MedicoRepository medicoRepository=(MedicoRepository)
       
        ApplicationContext.getRePository(RepositoryEnum.MEDICO_REPOSITORY);
       
       
        Medico medico1 = new Medico();
        medico1.setNombre("Jose");
        medico1.setApellido("Perez");
        medico1.setEspecialidad("Cirujano");
        medico1.setExequatur("007");
        medico1.setInstitucion("CENTRO MEDICO UCE"); 
        medico1.setDireccion("Mama Tingo");
        medico1.setTelefono("809-221-0007");
        medico1.setCodigo(1L);
        
        Medico medico2 = new Medico();
        medico2.setNombre("Jose");
        medico2.setApellido("Perez");
        medico2.setEspecialidad("Cirujano");
        medico2.setExequatur("007");
        medico2.setInstitucion("CENTRO MEDICO UCE"); 
        medico2.setDireccion("Mama Tingo");
        medico2.setTelefono("809-221-0007");
        medico2.setCodigo(2L);
       
        Medico medico3 = new Medico();
        medico3.setNombre("Jose");
        medico3.setApellido("Perez");
        medico3.setEspecialidad("Cirujano");
        medico3.setExequatur("007");
        medico3.setInstitucion("CENTRO MEDICO UCE"); 
        medico3.setDireccion("Mama Tingo");
        medico3.setTelefono("809-221-0007");
        medico3.setCodigo(3L);
        
        Medico medico4 = new Medico();
        medico4.setNombre("Jose");
        medico4.setApellido("Perez");
        medico4.setEspecialidad("Cirujano");
        medico4.setExequatur("007");
        medico4.setInstitucion("CENTRO MEDICO UCE"); 
        medico4.setDireccion("Mama Tingo");
        medico4.setTelefono("809-221-0007");
        medico4.setCodigo(4L);   
                
                
         medicoRepository.save(medico1);
         medicoRepository.save(medico2);
         medicoRepository.save(medico3);
         medicoRepository.save(medico4);
        
         
         //Metodo para buscar Doctores comparando por nombres
        Collections.sort(medicoRepository.findAll(), Medico.NombresComparator);
        System.out.println(medicoRepository.findAll());

        Collections.sort(medicoRepository.findAll(), Medico.ApellidosComparator);
        System.out.println(medicoRepository.findAll());

     
   }
    
}
