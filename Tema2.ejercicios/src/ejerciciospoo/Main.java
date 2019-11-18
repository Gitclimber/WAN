
package ejerciciospoo;


public class Main {
  
    public static void main(String[] args) {
        //Comprazapatilla
        Comprazapatilla compra1 = new Comprazapatilla();
        compra1.ponerPrecio(85.0);
        System.out.println("El precio con rebaja del 15% es "
         + compra1.obtenerPrecioRebajado(15) );
        //Rectangulo
        Rectangulo calculo1 = new Rectangulo();
        calculo1.definirlados(15, 25);
        System.out.println("El perimetro es " + calculo1.calculaperimetro() + " cm" );
        System.out.println("El area es " + calculo1.calculaarea() + " cm2");
        //
    }
    
}
