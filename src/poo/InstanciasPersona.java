package poo;

import java.util.Scanner;

public class InstanciasPersona {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		System.out.println("Cual es el nombre de la primera persona");
		persona1.nombre = reader.nextLine();
		System.out.println("Cuales son los apellidos de la primera persona");
		persona1.apellidos = reader.nextLine();
		System.out.println("Cual es el dni de la primera persona");
		persona1.dni = reader.nextLine();
		System.out.println("Cual es la edad de la primera peersona");
		persona1.edad = reader.nextInt();
		
		reader.nextLine();
		System.out.println();
		
		System.out.println("Cual es el nombre de la segunda persona");
		persona2.nombre = reader.nextLine();
		System.out.println("Cuales son los apellidos de la segunda persona");
		persona2.apellidos = reader.nextLine();
		System.out.println("Cual es el dni de la segunda persona");
		persona2.dni = reader.nextLine();
		System.out.println("Cual es la edad de la segunda persona");
		persona2.edad = reader.nextInt();
		
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
