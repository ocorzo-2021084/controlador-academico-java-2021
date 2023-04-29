package com.octavio.manejador;
import com.octavio.modelo.*;
import com.octavio.vista.*;
import java.util.ArrayList;
public class ControladorSalon{
	ArrayList<Salon> listaSalones = new ArrayList<>();
	BufferR bf=new BufferR();
	String Salon;
	String pregunta;
	String nombreSalon;
	int id;
	int contador=0;
	int falso=0;
	public void agregarSalones(int idSalon,String nombre,int cantidad){
	listaSalones.add(new Salon(idSalon,nombre,cantidad));
	}
	public void reporteSalon(){
		for(Salon i:listaSalones){
			System.out.println("Mostrando reporte de Salones");
			System.out.println(i.getCodigoSalon()+" "+i.getNombre()+" "+i.getCantidad());
		}
	}
	public void modificarSalon(){
		int opci;
		for(Salon i:listaSalones){
			System.out.println("----------------------------------------------");
			System.out.println("ingrese el Id de el salon que quiere modificar");
			System.out.println("----------------------------------------------");
			id=bf.ingresarNumero();
			System.out.println("----------------------------------------------");
			System.out.println("Ingrese 1 para continuar, ingrese 2 para cancelar");
			System.out.println("----------------------------------------------");
			if(id==i.getCodigoSalon()){
				opci=bf.ingresarNumero();
				switch(opci){
					case 1:
					System.out.println("Ingrese el nuevo dato");
					nombreSalon=bf.ingresarTexto();
					i.setNombre(nombreSalon);
					this.reporteSalon();
					break;
				}
				
				}else{
				falso++;
			}
			contador++;
		}
		if(falso==listaSalones.size()){
		System.out.println("El Salon no exite");
	}
	}
	public void eliminarSalones(){
		int opci;
		for(Salon i:listaSalones){
			System.out.println("--------------------------------------------------");
			System.out.println("ingrese el Id de el salon que quiere eliminar");
			System.out.println("--------------------------------------------------");
			id=bf.ingresarNumero();
			System.out.println("--------------------------------------------------");
			System.out.println("Ingrese 1 para continuar, ingrese 2 para cancelar");
			System.out.println("--------------------------------------------------");
			
			if(id==i.getCodigoSalon()){
				opci=bf.ingresarNumero();
				switch(opci){
					case 1:
					listaSalones.remove(nombreSalon);
					System.out.println("ELIMINANDO SALON");
					break;
				}
				
				}else{
				falso++;
			}
			contador++;
		}
		if(falso==listaSalones.size()){
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("No se ha agregado ningun salon para elminar, ingrese primero el salon para poder eliminarlo.");
		System.out.println("------------------------------------------------------------------------------------------------------");
	}
	}
}