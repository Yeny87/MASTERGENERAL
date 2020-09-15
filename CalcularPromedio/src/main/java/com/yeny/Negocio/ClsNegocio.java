/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeny.Negocio;



/**
 *
 * @author Sandra
 */
public class ClsNegocio {
    
    
    
    public Double funcPromedio1(String num1, String num2){
    Double lab1 = Double.parseDouble(num1);
    Double parcial1 = Double.parseDouble(num2);
    
    Double PromedioLab1 = lab1 * 0.40;
    Double PromedioParc1 = parcial1 * 0.60;
    
    Double Promedio = PromedioLab1 + PromedioParc1;
    Promedio /= 3;
    return Promedio;
    }
    
    public Double funcPromedio2(String num1, String num2){
    Double lab2 = Double.parseDouble(num1);
    Double parcial2 = Double.parseDouble(num2);
    
    Double PromedioLab2 = lab2 * 0.40;
    Double PromedioParc2 = parcial2 * 0.60;
    
    Double Promedio = PromedioLab2 + PromedioParc2;
    Promedio /= 3;
    return Promedio;
    }  
    
     public Double funcPromedio3(String num1, String num2){
    Double lab3 = Double.parseDouble(num1);
    Double parcial3 = Double.parseDouble(num2);
    
    Double PromedioLab3 = lab3 * 0.40;
    Double PromedioParc3 = parcial3 * 0.60;
    
    Double Promedio = PromedioLab3 + PromedioParc3;
    Promedio /= 3;
    return Promedio;
    }
     public Double PromedioFinal(Double Promedio1, Double Promedio2, Double Promedio3){
     Double Total= Promedio1 + Promedio2 + Promedio3;
     return Total;
     }
}
