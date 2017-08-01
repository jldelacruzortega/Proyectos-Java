/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.amortizacionprestamosbusiness.repository.Impl;

import com.itla.amortizacionprestamosbusiness.entity.Prestamo;
import com.itla.amortizacionprestamosbusiness.repository.PrestamoRepository;
import java.util.List;

/**
 *
 * @author JoseLuis
 */
public class PrestamoRepositoryImpl implements PrestamoRepository{

    @Override
    public void save(Prestamo entity) {
         System.out.println("El prestamo "+ entity.toString()+ " ha sido guardado" );
    }

    @Override
    public void update(Prestamo entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Prestamo finById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Prestamo> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
