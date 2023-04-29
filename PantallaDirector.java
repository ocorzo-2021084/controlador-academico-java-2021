package com.octavio.vista;
import com.octavio.manejador.*;
import com.octavio.modelo.*;
public class PantallaDirector{
	BufferR bf=new BufferR();
	ControladorMateria cMateria=new ControladorMateria();
	ControladorInstructor cInstructor=new ControladorInstructor();
	ControladorInstructores cInstructores=new ControladorInstructores();
	ControladorSalon cSalon=new ControladorSalon();
	ControladorUsuarios cUsuarios=new ControladorUsuarios();
	String arregloMateria;
	int idInstructores;
	int contador;
	int falso;
	int opci;
	int idInstructor=0;
	int opc;
	int idUsuario=0;
	int idMateria=0;
	int idSalon=0;
	String nombreMateria;
	String descripcionMateria;
	String nombre;
	String apellido;
	int telefono;
	int telefonoInstructores;;
	String direccion;
	String nombreSalon;
	int cantidadSalon;
	String nombreUsuario;
	String claveUsuario;
	String rolUsuario;
	String nombreInstructores;
	String apellidoInstructores;
	String nombreSalones;
	String nombreMaterias;
	public void menuPrincipal(){
		System.out.println("Bienvenido director Octavio :)");
		System.out.println("------------------------------");
		System.out.println("--------Menu de opciones--------");
		System.out.println("1...Materia");
		System.out.println("2...Instructor");
		System.out.println("3...Salones");
		System.out.println("4...Usuarios");
		System.out.println("5...Asignar");
		System.out.println("6...Salir");
		opc=bf.ingresarNumero();
		switch(opc){
			case 1:
			this.menuMateria();
			break;
			
			case 2:
			this.menuInstructor();
			break;
			
			case 3:
			this.menuSalones();
			break;
			
			case 4:
			this.menuUsuarios();
			break;
			
			case 5:
			this.menuAsignar();
			break;
			
			case 6:
			System.out.println("Gracias por usar mi programa, vuelva pronto.");
			break;
		}
	
	}
	public void menuMateria(){
		String op;
		System.out.println("1...Agregar materia");
		System.out.println("2...Modificar materia");
		System.out.println("3...Eliminar materia");
		System.out.println("4...Regresar");
		opc=bf.ingresarNumero();
		switch(opc){
			case 1:
			do{
			idMateria++;
			System.out.println("Ingrese el nombre de la materia");
			nombreMateria=bf.ingresarTexto();
			System.out.println("Ingrese la descripcion de la materia");
			descripcionMateria=bf.ingresarTexto();
			cMateria.agregarMateria(idMateria,nombreMateria,descripcionMateria);
			System.out.println("Desea agregar otra materia? (es recomendable que ingrese una materia por vez)");
			op=bf.ingresarTexto();
			}while(op.equals("si"));
			cMateria.reporteMateria();
			cMateria.modificarMateria();
			cMateria.eliminarMateria();
			break;
			
			case 2:
			cMateria.modificarMateria();
			break;
			
			case 3:
			cMateria.eliminarMateria();
			break;
			
			case 4:
			this.menuPrincipal();
			break;
			
		}
		
	}
	public void menuInstructor(){
		String op;
		System.out.println("1...Agregar instructor");
		System.out.println("2...Modificar instructor");
		System.out.println("3...Eliminar instructor");
		System.out.println("4...Regresar");
		opc=bf.ingresarNumero();
		switch(opc){
			case 1:
			do{
			idInstructor++;
			System.out.println("Ingrese el nombre de el instructor");
			nombre=bf.ingresarTexto();
			System.out.println("Ingrese el apellido de el instructor");
			apellido=bf.ingresarTexto();
			System.out.println("Ingrese el telefono de el instructor");
			telefono=bf.ingresarNumero();
			System.out.println("Ingrese la direccion de el instructor");
			direccion=bf.ingresarTexto();
			cInstructor.agregarInstructor(idInstructor,nombre,apellido,telefono,direccion);
			cInstructor.reporteInstructor();
			System.out.println("Desea agregar otro instructor? (es recomendable que ingrese un instructor por vez)");
			op=bf.ingresarTexto();
			}while(op.equals("si"));
			cInstructor.reporteInstructor();
			cInstructor.modificarInstructor();
			cInstructor.eliminarInstructores();
			break;
			
			case 2:
			cInstructor.modificarInstructor();
			break;
			
			case 3:
			cInstructor.eliminarInstructores();
			break;
			
			case 4:
			this.menuPrincipal();
			break;
		}
	}
	public void menuSalones(){;
		String op;
		System.out.println("1...Agregar salones");
		System.out.println("2...Modificar salones");
		System.out.println("3...Eliminar salones");
		System.out.println("4...Regresar");
		opci=bf.ingresarNumero();
		switch(opci){
			case 1:
			do{
			idSalon++;
			System.out.println("Ingrese el nombre de el salon");
			nombreSalon=bf.ingresarTexto();
			System.out.println("Ingrese la cantidad de personas que habra en el salon");
			cantidadSalon=bf.ingresarNumero();
			cSalon.agregarSalones(idSalon,nombreSalon,cantidadSalon);
			System.out.println("Desea agregar otro salon? (es recomendable que ingrese un instructor por vez)");
			op=bf.ingresarTexto();
			}while(op.equals("si"));
			cSalon.reporteSalon();
			cSalon.modificarSalon();
			cSalon.eliminarSalones();
			break;
			
			case 2:
			cSalon.modificarSalon();
			break;
			
			case 3:
			cSalon.eliminarSalones();
			break;
			
			case 4:
			this.menuPrincipal();
			
		}
	}
	public void menuUsuarios(){
		String op;
		System.out.println("1...Agregar Usuario");
		System.out.println("2...Modificar Usuario");
		System.out.println("3...Eliminar Usuario");
		System.out.println("4...Regresar");
		opci=bf.ingresarNumero();
		switch(opci){
			case 1:
			do{
			idUsuario++;
			System.out.println("Ingrese el nombre de el usuario");
			nombreUsuario=bf.ingresarTexto();
			System.out.println("Ingrese la clave de el usuario");
			claveUsuario=bf.ingresarTexto();
			System.out.println("Ingrede el rol del usuario");
			rolUsuario=bf.ingresarTexto();
			cUsuarios.agregarUsuario(nombreUsuario,idUsuario,claveUsuario,rolUsuario);
			System.out.println("Desea agregar otro usuario? (es recomendable que ingrese un usuario por vez)");
			op=bf.ingresarTexto();
			}while(op.equals("si"));
			cUsuarios.reporteUsuario();
			cUsuarios.modificarUsuarios();
			cUsuarios.eliminarUsuarios();
			break;
			
			
			case 2:
			cUsuarios.modificarUsuarios();
			break;
			
			case 3:
			cUsuarios.eliminarUsuarios();
			break;
			
			case 4:
			this.menuPrincipal();
		}
	}
	public void menuAsignar(){
		idInstructores++;
		System.out.println("-----------------------------------");
		System.out.println("Ingrese el nombre de el instructor:");
		System.out.println("-----------------------------------");
		nombreInstructores=bf.ingresarTexto();
		System.out.println("Ingrese el apellido de el instructor");
		apellidoInstructores=bf.ingresarTexto();
		System.out.println("-----------------------------------");
		System.out.println("Ingrese el telefono de el instructor");
		System.out.println("-----------------------------------");
		telefonoInstructores=bf.ingresarNumero();
		System.out.println("-----------------------------------");
		System.out.println("Ingrese la direccion de el instructor");
		System.out.println("-----------------------------------");
		direccion=bf.ingresarTexto();
		System.out.println("-----------------------------------");
		System.out.println("Ingrese el nombre de la materia");
		System.out.println("-----------------------------------");
		nombreMateria=bf.ingresarTexto();
		System.out.println("-----------------------------------");
		System.out.println("Ingrese el nombre de el salon");
		System.out.println("-----------------------------------");
		nombreSalones=bf.ingresarTexto();
		cInstructores.agregarInstructores(idInstructores,nombreInstructores,apellidoInstructores,telefonoInstructores,direccion,nombreMaterias,nombreSalones);
		System.out.println("-----------------------------------");
		System.out.println("Materia Asignada al instructor ");
		System.out.println("-----------------------------------");
		cInstructores.reporteInstructores();
		}
	
		
		
	
}