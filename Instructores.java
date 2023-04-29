package com.octavio.modelo;
public class Instructores{
	int idInstrucores;
	String nombre;
	String apellido;
	int telefono;
	String direccion;
	String nombreMateria;
	String nombreSalon;
	
	public Instructores(int idInstrucor,String nombre,String apellido,int telefono,String direccion,String nombreMateria,String nombreSalon){
		this.idInstrucores=idInstrucores;
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
		this.direccion=direccion;
		this.nombreMateria=nombreSalon;
		this.nombreSalon=nombreSalon;
		
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
	public void setNombreMateria(String nombreMateria){
		this.nombreMateria=nombreMateria;
	}
	public void setNombreSalon(String nombreSalon){
		this.nombreSalon=nombreSalon;
	}
	public int getIdInstructores(){
		return idInstrucores;
	}
	public String getNombreInstructores(){
		return nombre;
	}
	public String getApellidoInstructores(){
		return apellido;
	}	
	public int getTelefonoInstructores(){
		return telefono;
	}	
	public String getDireccionInstructores(){
		return direccion;
	}	
	public String getNombreMateria(){
		return nombreMateria;
	}
	public String getNombreSalon(){
		return nombreSalon;
	}
}

