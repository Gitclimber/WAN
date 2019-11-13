package Retorno_valor;

public class Transporte {

	int precio = 0;
	
	public Transporte(int precio) {
		System.out.println("SE creó un objeto transporte");
		this.precio = precio;
	}
	
	public int  precio() {
		return 50;
	}
}
