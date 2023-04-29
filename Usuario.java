package com.octavio.modelo;
public class Usuario{
	String nombre;
	int id;
	String clave;
	String rol; 
	
	public Usuario(){
		nombre="octavio";
		id=1;
		clave="123";
		rol="d";		
	}
	
	public Usuario(String nombre,int id,String clave,String rol){
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

