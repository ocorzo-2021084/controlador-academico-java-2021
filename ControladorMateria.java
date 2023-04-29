package com.octavio.manejador;
import com.octavio.modelo.*;
import com.octavio.vista.*;
import java.util.ArrayList;
public class ControladorMateria{
	ArrayList<Materia> listaMateria = new ArrayList<Materia>();
	BufferR bf=new BufferR();
	String materia;
	String pregunta;
	String nombreMateria;
	int id;
	int contador=0;
	int falso=0;
	public void agregarMateria(int idMateria,String nombreMateria,String descripcionMateria){
		listaMateria.add(new Materia(idMateria,nombreMateria,descripcionMateria));
	}	
	
	public void reporteMateria(){
		for(Materia i:listaMateria){
			System.out.println("Mostrando reporte de materia");
			System.out.println(i.getCodigoMateria()+" "+i.getNombreMateria()+" "+i.getDescripcionMateria());
		}
	}
	public void modificarMateria(){
		int opci;
		for(Materia i:listaMateria){
			System.out.println("-------------------------------------------------");
			System.out.println("ingrese el Id de la materia que quiere modificar");
			System.out.println("-------------------------------------------------");
			id=bf.ingresarNumero();
			System.out.println("-------------------------------------------------");
			System.out.println("Ingrese 1 para continuar, ingrese 2 para cancelar");
			System.out.println("-------------------------------------------------");
			if(id==i.getCodigoMateria()){
				opci=bf.ingresarNumero();
				switch(opci){
					case 1:
					System.out.println("Ingrese el nuevo dato");
					nombreMateria=bf.ingresarTexto();
					i.setNombreMateria(nombreMateria);
					this.reporteMateria();
					break;
				}
				
				}else{
				falso++;
			}
			contador++;
		}
		if(falso==listaMateria.size()){
		System.out.println("La materia no existe");
	}
	}
		public void eliminarMateria(){
		int opci;
		for(Materia i:listaMateria){
			System.out.println("-------------------------------------------------");
			System.out.println("ingrese el Id de la materia que quiere eliminar");
			System.out.println("-------------------------------------------------");
			id=bf.ingresarNumero();
			System.out.println("-------------------------------------------------");
			System.out.println("Ingrese 1 para continuar, ingrese 2 para cancelar");
			System.out.println("-------------------------------------------------");
			if(id==i.getCodigoMateria()){
				opci=bf.ingresarNumero();
				switch(opci){
					case 1:
					listaMateria.remove(nombreMateria);
					System.out.println("ELIMINANDO MATERIA");
					break;
				}
				
				}else{
				falso++;
			}
			contador++;
		}
		if(falso==listaMateria.size()){
		System.out.println("No se ha agregado ninguna materia para elminar, ingrese primero la materia para poder eliminarla.");
	}
	}
		

}