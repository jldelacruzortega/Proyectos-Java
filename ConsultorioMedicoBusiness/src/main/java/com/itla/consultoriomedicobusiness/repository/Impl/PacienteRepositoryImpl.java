/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.repository.Impl;

import com.itla.consultoriomedicobusiness.entity.Paciente;
import com.itla.consultoriomedicobusiness.repository.PacienteRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoseLuis
 */
public class PacienteRepositoryImpl implements PacienteRepository {

   private List<Paciente> PacienteList = new ArrayList<>();

    @Override
    public void save(Paciente entity) {
        PacienteList.add(entity);
    }

    @Override
    public void update(Paciente entity) {
        int index = PacienteList.indexOf(entity);
        PacienteList.set(index, entity);
    }

    @Override
    public Paciente finById(Long id) {
        return PacienteList.get(id.intValue());
    }

    @Override
    public List<Paciente> findAll() {
        return PacienteList;
    }

    
}
