package Parametros;

public class Persona {

	String nombre = "";
	int edad = 0;
	public Persona(String nom, int age) {
		this.nombre = nom;
		this.edad = age;
		System.out.println("El objeto " + nombre + " tiene " + edad + " años");
		
	}
	
}
