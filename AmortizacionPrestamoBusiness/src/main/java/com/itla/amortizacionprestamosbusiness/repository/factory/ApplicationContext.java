/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.amortizacionprestamosbusiness.repository.factory;

import com.itla.amortizacionprestamosbusiness.enums.RepositoryEnum;
import com.itla.amortizacionprestamosbusiness.repository.Impl.ClienteRepositoryImpl;
import com.itla.amortizacionprestamosbusiness.repository.Impl.PrestamoRepositoryImpl;
import com.itla.amortizacionprestamosbusiness.repository.Repository;

/**
 *
 * @author JoseLuis
 */
public class ApplicationContext {
    
    
    public static Repository getRePository(RepositoryEnum repositoryEnum){
        
        switch(repositoryEnum){
            case CLIENTE_REPOSITORY:
                return new ClienteRepositoryImpl();
            case PRESTAMO_REPOSITORY:
                return new PrestamoRepositoryImpl();
            default:
                
                            
        }
        return null;
    }
    
}
