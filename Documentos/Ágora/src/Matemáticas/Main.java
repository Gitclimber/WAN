package Matemáticas;

import java.util.Scanner;

public class Main {

	public static void perfect() {
		Scanner entrada = new Scanner(System.in);
		int e;
		System.out.println("Entregue el numero al sombrero seleccionador:  ");
		e = entrada.nextInt();
		
		double R;
		double L;
		int i;
		int W;
		L = 0;
		
		R= 0;
		W = 0;
		i=e-1;
		while (i > 0) {
			
		if(e%i == 0) {
			System.out.println(i + " es multiplo de " + e);
			W= W + i;
		}
		else {
			System.out.println(i + " no es multiplo de " + e);
		}
		i--;
		
		
		
		
	}
System.out.println(" El resultado del numero buscado para " + e + " es " + W);
if (W == e) {
	System.out.println(" El numero " + e + " es un numero mágico ");
	
}
else {
	System.out.println( "El numero " + e + " es un nomag ");
}

if(W == 1) {
	System.out.println("Pero al menos es primo ... ya es algo!");
		
	
}
else {
	
}
}
}

