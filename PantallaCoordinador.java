package com.octavio.vista;
import com.octavio.manejador.*;
import com.octavio.modelo.*;
public class PantallaCoordinador{
	BufferR bf=new BufferR();
	ControladorMateria cMateria=new ControladorMateria();
	ControladorInstructor cInstructor=new ControladorInstructor();
	ControladorInstructores cInstructores=new ControladorInstructores();
	ControladorSalon cSalon=new ControladorSalon();
	ControladorUsuarios cUsuarios=new ControladorUsuarios();
	String arregloMateria;
	int contador;
	int falso;
	int opci;
	int idInstructor=0;
	int idInstructores=0;
	int opc;
	int idUsuario=0;
	int idMateria=0;
	int idSalon=0;
	String descripcionMateria;
	String nombre;
	String apellido;
	int telefono;
	String direccion;
	String nombreSalones;
	int cantidadSalon;
	String nombreUsuario;
	String claveUsuario;
	String rolUsuario;
	String Instructor;
	String pregunta;
	String nombreInstructores;
	String apellidoInstructores;
	String nombreMateria;
	int telefonoInstructores;
	
	public void menuPrincipal(){
		System.out.println("----Bienvenido Coordinador----");
		System.out.println("------------------------------");
		System.out.println("--------Menu de opciones--------");
		System.out.println("1...Crear Materia");
		System.out.println("2...Crear Instructor");
		System.out.println("3...Asignar");
		opc=bf.ingresarNumero();
		switch(opc){
			case 1:
			this.menuMateria();
			break;
			
			case 2:
			this.menuInstructor();
			break;
			
			case 3:
			this.menuAsignar();
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
		cInstructores.agregarInstructores(idInstructores,nombreInstructores,apellidoInstructores,telefonoInstructores,direccion,nombreMateria,nombreSalones);
		System.out.println("-----------------------------------");
		System.out.println("Materia Asignada al instructor ");
		System.out.println("-----------------------------------");
		cInstructores.reporteInstructores();
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
	
	
	
	
	}
