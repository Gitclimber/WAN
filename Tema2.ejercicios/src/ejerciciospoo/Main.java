
package ejerciciospoo;


public class Main {
  
    public static void main(String[] args) {
        
        Comprazapatilla compra1 = new Comprazapatilla();
        compra1.ponerPrecio(85.0);
        System.out.println("El precio con rebaja del 15% es "
         + compra1.obtenerPrecioRebajado(15) );
        
        Rectangulo calculo1 = new Rectangulo();
        calculo1.definirlado(0.15, 0.25);
        System.out.println("Los lados son de " );
        
    }
    
}
