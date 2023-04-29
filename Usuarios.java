package com.octavio.modelo;
public class Usuarios{
	String nombre;
	int id;
	String clave;
	String rol; 
	
	
	
	public Usuarios(String nombre,int id,String clave,String rol){
		this.nombre=nombre;
		this.id=id;
		this.clave=clave;
		this.rol=rol;
	}
	
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setClave(String clave){
		this.clave=clave;
	}
	public void setRol(String rol){
		this.rol=rol;
	}
	public String getNombre(){
		return nombre;
	}
	public int getId(){
		return id;
	}
	public String getClave(){
		return clave;
	}
	public String getRol(){
		return rol;
	}	
}

