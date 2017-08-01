/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.amortizacionprestamosbusiness.repository.Impl;

import com.itla.amortizacionprestamosbusiness.entity.Cliente;
import com.itla.amortizacionprestamosbusiness.repository.ClienteRepository;
import java.util.List;

/**
 *
 * @author JoseLuis
 */
public class ClienteRepositoryImpl implements ClienteRepository{

    @Override
    public void save(Cliente entity) {
         System.out.println("El cliente "+ entity.toString()+ " ha sido guardado" );
    }

    @Override
    public void update(Cliente entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente finById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
