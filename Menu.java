package com.octavio.vista;
import com.octavio.manejador.*;
import com.octavio.modelo.*;
public class Menu{
	BufferR bf=new BufferR(); 	
	Usuario usuario=new Usuario();
	ControladorUsuario cUsuario=new ControladorUsuario();
	
	String user;
	String clave;
	
	
	public void loginInicial(){
		System.out.println("------------------");
		System.out.println("Ingrese su usuario:");
		System.out.println("------------------");
		user=bf.ingresarTexto();
		System.out.println("------------------");
		System.out.println("Ingrese su clave:");
		System.out.println("------------------");
		clave=bf.ingresarTexto();
		System.out.println("------------------");
		cUsuario.logInicial(user,clave);
	
		
	}
	
	

}