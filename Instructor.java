package com.octavio.modelo;
public class Instructor{
	int idInstrucor;
	String nombre;
	String apellido;
	int telefono;
	String direccion;
	
	public Instructor(int idInstrucor,String nombre,String apellido,int telefono,String direccion){
		this.idInstrucor=idInstrucor;
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
		this.direccion=direccion;
		
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	
	public void setTelefono(int telefono){
		this.telefono=telefono;
	}
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	public int getIdInstructor(){
		return idInstrucor;
	}
	public String getNombreInstructor(){
		return nombre;
	}
	public String getApellidoInstructor(){
		return apellido;
	}	
	public int getTelefonoInstructor(){
		return telefono;
	}	
	public String getDireccionInstructor(){
		return direccion;
	}	
	
}

