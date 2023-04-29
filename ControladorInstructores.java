package com.octavio.manejador;
import com.octavio.modelo.*;
import com.octavio.vista.*;
import java.util.ArrayList;
public class ControladorInstructores{

	ArrayList<Instructores> listaDeInstructores = new ArrayList<Instructores>();
	BufferR bf=new BufferR();
	int idInstructores;
	String nombreMaterias;
	int contador=0;
	int falso=0;
	public void agregarInstructores(int idInstructores,String nombre,String apellido,int telefono,String direccion,String nombreMaterias,String nombreSalones){
	listaDeInstructores.add(new Instructores(idInstructores,nombre,apellido,telefono,direccion,nombreMaterias,nombreSalones));
	}
	public void reporteInstructores(){
		for(Instructores i:listaDeInstructores){
			System.out.println("Mostrando reporte de Instructor");
			System.out.println(i.getIdInstructores()+" "+i.getNombreInstructores()+" "+i.getApellidoInstructores()+" "+i.getTelefonoInstructores()+" "+i.getDireccionInstructores()+" "+i.getNombreMateria()+" "+i.getNombreSalon());
		}
	}
	
}	