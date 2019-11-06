package Matemáticas;

public class Areacircle {

	 public static void main(String[] args) {
		 double a,r; // área y radio
		 
		 System.out.print("Introduce el radio de un circulo: ");
		 r=Entrada.real();
		 
		 a=Math.PI*(r*r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
		 
		 System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);
	 }
}
