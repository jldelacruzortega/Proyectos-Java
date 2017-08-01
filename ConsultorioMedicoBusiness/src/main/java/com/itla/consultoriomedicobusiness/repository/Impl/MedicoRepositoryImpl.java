/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.repository.Impl;

import com.itla.consultoriomedicobusiness.entity.Medico;
import com.itla.consultoriomedicobusiness.repository.MedicoRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoseLuis
 */
public class MedicoRepositoryImpl implements MedicoRepository {

     private List<Medico> medicoList= new ArrayList<>();
     
    @Override
    public void save(Medico entity) {
      medicoList.add(entity);   
    }

    @Override
    public void update(Medico entity) {
        int  index = medicoList.indexOf(entity);
        medicoList.set(index, entity);
    }

    @Override
    public Medico finById(Long id) {
        return medicoList.get(id.intValue());
    }

    @Override
    public List<Medico> findAll() {
        return medicoList;
    }
    
}
