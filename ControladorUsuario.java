package com.octavio.manejador;
import com.octavio.modelo.*;
import com.octavio.vista.*;
import java.util.ArrayList;
public class ControladorUsuario{	
	Usuario usuario=new Usuario();
	PantallaDirector pDirector=new PantallaDirector();  
	PantallaCoordinador pCoordinador=new PantallaCoordinador();
	ArrayList<Usuario> listaUsuarios=new ArrayList<Usuario>();
	
	
	public void logInicial(String user, String clave){
		
		if(user.equals(usuario.getNombre())&& clave.equals(usuario.getClave())){
		
			if(usuario.getRol().equals("d")){
				pDirector.menuPrincipal();
			
				
			}else if(usuario.getRol().equals("c")){
				pCoordinador.menuPrincipal();
				
			}
		}else{
			System.out.println("Datos incorrectos");
		}

	}
}	