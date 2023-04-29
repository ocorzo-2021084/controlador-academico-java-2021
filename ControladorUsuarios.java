package com.octavio.manejador;
import com.octavio.modelo.*;
import com.octavio.vista.*;
import java.util.ArrayList;
public class ControladorUsuarios{
	ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
	BufferR bf=new BufferR();
	String Usuarios;
	String pregunta;
	String nombreUsuarios;
	int idUsuarios;
	String claveUsuarios;
	String rolUsuarios;
	int id;
	int contador=0;
	int falso=0;
	public void agregarUsuario(String nombre,int id,String clave,String rol){
		listaUsuarios.add(new Usuarios(nombre,id,clave,rol));
		
	}
	public void reporteUsuario(){
		for(Usuarios i:listaUsuarios){
			System.out.println("Mostrando reporte de Usuario");
			System.out.println(i.getNombre()+" "+i.getId()+" "+i.getClave()+" "+i.getRol());
		}
	}
	public void modificarUsuarios(){
		int opci;
		for(Usuarios i:listaUsuarios){
			System.out.println("ingrese el Id de el usuario que quiere modificar");
			id=bf.ingresarNumero();
			System.out.println("Ingrese 1 para continuar, ingrese 2 para cancelar");
			if(id==i.getId()){
				opci=bf.ingresarNumero();
				switch(opci){
					case 1:
					System.out.println("Ingrese el nuevo dato");
					nombreUsuarios=bf.ingresarTexto();
					i.setNombre(nombreUsuarios);
					this.reporteUsuario();
					break;
				}
				
				}else{
				falso++;
			}
			contador++;
		}
		if(falso==listaUsuarios.size()){
		System.out.println("El usuario no existe");
	}
	}
	public void eliminarUsuarios(){
		int opci;
		for(Usuarios i:listaUsuarios){
			System.out.println("-----------------------------------------------");
			System.out.println("ingrese el Id de el usuario que quiere eliminar");
			System.out.println("-----------------------------------------------");
			id=bf.ingresarNumero();
			System.out.println("-----------------------------------------------");
			System.out.println("Ingrese 1 para continuar, ingrese 2 para cancelar");
			System.out.println("-----------------------------------------------");
			if(id==i.getId()){
				opci=bf.ingresarNumero();
				switch(opci){
					case 1:
					listaUsuarios.remove(nombreUsuarios);
					System.out.println("ELIMINANDO USUARIO");
					break;
				}
				
				}else{
				falso++;
			}
			contador++;
		}
		if(falso==listaUsuarios.size()){
		System.out.println("No se ha agregado ningun usuario para elminar, ingrese primero el usuario para poder eliminarlo.");
	}
	}
	
}
