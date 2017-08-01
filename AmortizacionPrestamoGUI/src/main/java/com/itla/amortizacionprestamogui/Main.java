/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.amortizacionprestamogui;

import com.itla.amortizacionprestamosbusiness.entity.Cliente;
import com.itla.amortizacionprestamosbusiness.enums.RepositoryEnum;
import com.itla.amortizacionprestamosbusiness.repository.ClienteRepository;
import com.itla.amortizacionprestamosbusiness.repository.factory.ApplicationContext;

/**
 *
 * @author JoseLuis
 */
public class Main {
    
     public static void main(String[] args) {

        Cliente cliente = new Cliente();
        
        cliente.setNombre("Jose");
        cliente.setApellido("De la Cruz");
        cliente.setCedula("225-0433379-7");
        cliente.setTelefono("809-555-5555");

        ClienteRepository clienteRepository = (ClienteRepository) ApplicationContext.getRePository(RepositoryEnum.CLIENTE_REPOSITORY);
        clienteRepository.save(cliente);


    }
    
}
