package ar.unju.edu.fi.main;

import java.util.Scanner;

import ar.unju.edu.fi.model.Alumno;
import ar.unju.edu.fi.model.Materia;
import ar.unju.edu.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		/**
		 * Se pide agregar las notas finales
		 * de un Alumno, de cuatro materias al azar.
		 */
		
		Alumno alumno = generarAlumno();
		
		registrarNotas(alumno,1);
		
	}
	
	public static Alumno generarAlumno() {
		
		Scanner sc = new Scanner(System.in);
		
		Alumno alumno = new Alumno();
		System.out.print("Ingrese el legajo del Alumno: ");
		Integer legajo = sc.nextInt();
		System.out.print("Ingrese el apellido del Alumno: ");
		String apellido = sc.next();
		System.out.print("Ingrese el nombre del Alumno: ");
		String nombre = sc.next();
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		return alumno;
	}
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner sc = new Scanner(System.in);
		while (numMaterias <= 4) {
			System.out.print("Ingrese el codigo de la Materia: ");
			String codigoMateria = sc.next();
			System.out.print("Ingrese el nombre de la Materia: ");
			String nombreMateria = sc.next();
			Materia  materia =new Materia(codigoMateria, nombreMateria);
			
			
			System.out.print("Ingrese el codigo del Registro de Nota: ");
			String codigoNota = sc.next();
			System.out.print("Ingrese la Nota la Nota Final: ");
			Float notaFinal= sc.nextFloat();
			RegistroNota registroNota =new RegistroNota(codigoNota, alumno, materia, notaFinal);
			
			System.out.println(registroNota.toString());
			numMaterias++;
		}
		sc.close();
	}

}
