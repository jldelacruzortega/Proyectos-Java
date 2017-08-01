/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.repository.Impl;

import com.itla.consultoriomedicobusiness.entity.Cita;
import com.itla.consultoriomedicobusiness.repository.CitaRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoseLuis
 */
public class CitaRepositoryImpl implements CitaRepository {

   
   private List<Cita> CitaList = new ArrayList<>();

    @Override
    public void save(Cita entity) {
        CitaList.add(entity);
    }

    @Override
    public void update(Cita entity) {
        int index = CitaList.indexOf(entity);
        CitaList.set(index, entity);
    }

    @Override
    public Cita finById(Long id) {
        return CitaList.get(id.intValue());
    }

    @Override
    public List<Cita> findAll() {
        return CitaList;
    }

    
}
