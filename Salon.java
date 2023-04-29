package com.octavio.modelo;
public class Salon{
	int codigoSalon;
	String nombre;
	int cantidad;
	
	public Salon(int codigoSalon,String nombre,int cantidad){
		this.codigoSalon=codigoSalon;
        this.nombre=nombre;
        this.cantidad=cantidad;
		
	}
	private void setCodigoSalon(String codigoMateria){
        this.codigoSalon=codigoSalon;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }

    public int getCodigoSalon(){
        return codigoSalon;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidad(){
        return cantidad;
    }


}