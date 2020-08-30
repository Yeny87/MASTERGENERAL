/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeny.clase2.ejerciciolaboratorio;

/**
 *
 * @author Sandra
 */
public class Persona {  
//    Atributos de la Clase Persona, persona 1
    
private String Nombre; 
private int Edad; 
private char Sexo;
private double Peso; 
private double Altura;

   
//Contrustor vacio para recibir datos por teclado 
public Persona(){
    
}

//Construnctor con todos los parametros para persona 1 
    
    public Persona(String Nombre, int Edad, char Sexo, double Peso, double Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }

//Constructor con Nombre, Edad y sexo, parametros de persona 2

public Persona(String Nombre, int Edad, char Sexo){
    
    this.Nombre= Nombre;
    this.Edad = Edad; 
    this.Sexo = Sexo;
}




//GET Y SET

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }
    public String EsmayordeEdad(){

        int edad = this.Edad;
        if (edad<18){
        return "Es menor de edad";
        }
        else{
        return "Es mayor de edad";
        }
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

//    Metodo toString parea presentar atributos de la persona 1
    public String toString1() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Peso=" + Peso + ", Altura=" + Altura + '}';
    }

//    Metodo toString parea presentar atributos de la persona 2
    public String toString2() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + '}';
    }


    
}
