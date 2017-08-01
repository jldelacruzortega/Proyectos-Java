/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.amortizacionprestamosbusiness.entity;

import java.util.Date;


/**
 *
 * @author JoseLuis
 */
public class Prestamo {
    
    protected Long id;
    protected Long no_Prestamo;
    protected Date fecha_de_pago;
    protected Long balance_inicial;
    protected Long cuota_a_pagar;
    protected int intereses;
    protected Long abono_a_capital;
    protected Long saldo;   

    public long getId() {
        return id;
    }

    public void setId_Prestamo(long id) {
        this.id = id;
    }

    public long getNo_Prestamo() {
        return no_Prestamo;
    }

    public void setNo_Prestamo(long no_Prestamo) {
        this.no_Prestamo = no_Prestamo;
    }

    public Date getFecha_de_pago() {
        return fecha_de_pago;
    }

    public void setFecha_de_pago(Date fecha_de_pago) {
        this.fecha_de_pago = fecha_de_pago;
    }

    public long getBalance_inicial() {
        return balance_inicial;
    }

    public void setBalance_inicial(long balance_inicial) {
        this.balance_inicial = balance_inicial;
    }

    public long getCuota_a_pagar() {
        return cuota_a_pagar;
    }

    public void setCuota_a_pagar(long cuota_a_pagar) {
        this.cuota_a_pagar = cuota_a_pagar;
    }

    public int getIntereses() {
        return intereses;
    }

    public void setIntereses(int intereses) {
        this.intereses = intereses;
    }

    public long getAbono_a_capital() {
        return abono_a_capital;
    }

    public void setAbono_a_capital(Long abono_a_capital) {
        this.abono_a_capital = abono_a_capital;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }
     
      
}