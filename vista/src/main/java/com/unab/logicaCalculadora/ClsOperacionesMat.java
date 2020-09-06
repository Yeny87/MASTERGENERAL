/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.logicaCalculadora;

/**
 *
 * @author Sandra
 */
public class ClsOperacionesMat {
    
   private Double Dato1;
   private Double Dato2;

    public double getDato1() {
        return Dato1;
    }

    public void setDato1(double Dato1) {
        this.Dato1 = Dato1;
    }

    public double getDato2() {
        return Dato2;
    }

    public void setDato2(double Dato2) {
        this.Dato2 = Dato2;
    }

    public Double Suma(Double Dato1, Double Dato2) {
        this.Dato1 = Dato1;
        this.Dato2 = Dato2;
        
        
       return Dato1+Dato2;
        
        
    }
    
    
}
