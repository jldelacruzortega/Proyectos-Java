/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicogui;

import com.itla.consultoriomedicobusiness.entity.Medico;
import com.itla.consultoriomedicobusiness.enums.RepositoryEnum;
import com.itla.consultoriomedicobusiness.repository.MedicoRepository;
import com.itla.consultoriomedicobusiness.repository.factory.ApplicationContext;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author JoseLuis
 */
public class MainSet {
    
     public static void main(String[] args){
        
        MedicoRepository medicoRepository=(MedicoRepository) 
                ApplicationContext.getRePository(RepositoryEnum.MEDICO_REPOSITORY);
        
        Medico medico1 = new Medico();
        medico1.setNombre("Gleydy");
        medico1.setApellido("Matos");
        medico1.setCodigo(1L);
       
        
        Medico medico2 = new Medico();
        medico2.setNombre("Gleydy");
        medico2.setApellido("Matos");
        medico2.setCodigo(2L);
        
        System.out.println(medico1.equals(medico2));
        
        System.out.println("medico:: "+ medico1.hashCode());
        System.out.println("medico:: "+ medico2.hashCode());
        
        Set<Medico> medicoSet= new HashSet<> (medicoRepository.findAll());
    }
    
}
