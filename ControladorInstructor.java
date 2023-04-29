package com.octavio.manejador;
import com.octavio.modelo.*;
import com.octavio.vista.*;
import java.util.ArrayList;
public class ControladorInstructor{

	ArrayList<Instructor> listaInstructores = new ArrayList<Instructor>();
	BufferR bf=new BufferR();
	String Instructor;
	String pregunta;
	String nombreInstructor;
	int id;
	int contador=0;
	int falso=0;
	public void agregarInstructor(int idInstructor,String nombre,String apellido,int telefono,String direccion){
	listaInstructores.add(new Instructor(idInstructor,nombre,apellido,telefono,direccion));
	}
	public void reporteInstructor(){
		for(Instructor i:listaInstructores){
			System.out.println("Mostrando reporte de Instructor");
			System.out.println(i.getIdInstructor()+" "+i.getNombreInstructor()+" "+i.getApellidoInstructor()+" "+i.getTelefonoInstructor()+" "+i.getDireccionInstructor());
		}
	}
	public void modificarInstructor(){
		int opci;
		for(Instructor i:listaInstructores){
			System.out.println("-----------------------------------------------");
			System.out.println("ingrese el Id de el instructor que quiere modificar");
			System.out.println("-----------------------------------------------");
			id=bf.ingresarNumero();
			System.out.println("-----------------------------------------------");
			System.out.println("Ingrese 1 para continuar, ingrese 2 para cancelar");
			System.out.println("-----------------------------------------------");
			if(id==i.getIdInstructor()){
				opci=bf.ingresarNumero();
				switch(opci){
					case 1:
					System.out.println("-----------------------------------------------");
					System.out.println("Ingrese el nuevo dato");
					System.out.println("-----------------------------------------------");
					nombreInstructor=bf.ingresarTexto();
					i.setNombre(nombreInstructor);
					System.out.println("-----------------------------------------------");
					System.out.println("Arreglo modificado");
					System.out.println("-----------------------------------------------");
					this.reporteInstructor();
					break;
					
					
					
				}
				
				}else{
				falso++;
			}
			contador++;
		}
		if(falso==listaInstructores.size()){
		System.out.println("El instructor no existe");
	}
	}
	public void eliminarInstructores(){
		int opci;
		for(Instructor i:listaInstructores){
			System.out.println("--------------------------------------------------");
			System.out.println("ingrese el Id de el instructor que quiere eliminar");
			System.out.println("--------------------------------------------------");
			id=bf.ingresarNumero();
			System.out.println("--------------------------------------------------");
			System.out.println("Ingrese 1 para continuar, ingrese 2 para cancelar");
			System.out.println("--------------------------------------------------");
			if(id==i.getIdInstructor()){
				opci=bf.ingresarNumero();
				switch(opci){
					case 1:
					listaInstructores.remove(nombreInstructor);
					System.out.println("ELIMINANDO INSTRUCTOR");
					break;
				}
				
				}else{
				falso++;
			}
			contador++;
		}
		if(falso==listaInstructores.size()){
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("No se ha agregado ningun instructor para elminar, ingrese primero el Instructor para poder eliminarlo.");
		System.out.println("------------------------------------------------------------------------------------------------------");
	}
	}

	

	
}