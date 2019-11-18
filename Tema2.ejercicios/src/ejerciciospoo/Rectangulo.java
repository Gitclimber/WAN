
package ejerciciospoo;


public class Rectangulo {
    //ATRIBUTOS
    private int  ladox;
    private int ladoy;
    
    //MÉTODOS
     public  void definirladox(int x) {
         this.ladox = x;
         }
     
      public void definirladoy(int y) {
         this.ladoy = y;
     }
     public void definirlados(int x, int y) {
         this.ladox = x;
         this.ladoy = y;
     }
     
   public int calculaperimetro() {
       
       return (2*ladox + 2*ladoy);
   }
   public int calculaarea() {
       
       return (ladox*ladoy);
   }
   
   }

