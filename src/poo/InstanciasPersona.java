package poo;

import java.util.Scanner;

public class InstanciasPersona {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		

		
		System.out.println("Cual es el nombre de la primera persona");
		String nombre = reader.nextLine();
		System.out.println("Cuales son los apellidos de la primera persona");
		String apellidos = reader.nextLine();
		System.out.println("Cual es el dni de la primera persona");
		String dni = reader.nextLine();
		System.out.println("Cual es la edad de la primera peersona");
		int edad = reader.nextInt();
		
		reader.nextLine();
		System.out.println();
		
		Persona persona1 = new Persona(nombre, apellidos, dni, edad);
		
		System.out.println("Cual es el nombre de la segunda persona");
		nombre = reader.nextLine();
		System.out.println("Cuales son los apellidos de la segunda persona");
		apellidos = reader.nextLine();
		System.out.println("Cual es el dni de la segunda persona");
		dni = reader.nextLine();
		System.out.println("Cual es la edad de la segunda persona");
		edad = reader.nextInt();
		
		Persona persona2 = new Persona(nombre, apellidos, dni, edad);

		
		if (persona1.edad > 18) {
			System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + " es mayor de edad.");
		}else {
			System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + " no es mayor de edad.");
		}
		
		if (persona2.edad > 18) {
			System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + " es mayor de edad.");
		}else {
			System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + " no es mayor de edad.");
		}
		
		
		reader.close();
	}

}
