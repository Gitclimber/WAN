f´public class Automovil {

	String marca;
	int precio;
	int modelo;
	
	boolean estado = false;
	
	public Automovil (){
		System.out.println("Se creo un objeto de tipo automovil");
	}
	
	public void encender() {
		System.out.println("El automovil esta encendido");
		if(estado == true) {
			System.out.println("El carro ya está encendido");
		}
		}
	
	public void apagar() {
		System.out.println("El automovil esta apagado");
		
	}
	public void avanzar() {
		System.out.println("El automovil esta andando");
	}
	
	
}

