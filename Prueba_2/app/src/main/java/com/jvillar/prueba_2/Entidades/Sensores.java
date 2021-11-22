package com.jvillar.prueba_2.Entidades;

public class Sensores {

    private String Nombre;
    private String Tipo;
    private String Valor;


    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String getTipo(){
        return Tipo;
    }

    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }

    public String getValor(){
        return Valor;
    }

    public void setValor(String Valor){
        this.Valor = Valor;
    }

}
