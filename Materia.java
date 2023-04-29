package com.octavio.modelo;
public class Materia{
    int codigoMateria;
    String nombreMateria;
    String descripcionMateria;

    public Materia(int codigoMateria, String nombreMateria, String descripcionMateria){
        this.codigoMateria=codigoMateria;
        this.nombreMateria=nombreMateria;
        this.descripcionMateria=descripcionMateria;
    }

    private void setCodigoMateria(int codigoMateria){
        this.codigoMateria=codigoMateria;
    }
    public void setNombreMateria(String nombreMateria){
        this.nombreMateria=nombreMateria;
    }
    public void setdescripcionMateria(String descripcionMateria){
        this.descripcionMateria=descripcionMateria;
    }

    public int getCodigoMateria(){
        return codigoMateria;
    }
    public String getNombreMateria(){
        return nombreMateria;
    }
    public String getDescripcionMateria(){
        return descripcionMateria;
    }
}