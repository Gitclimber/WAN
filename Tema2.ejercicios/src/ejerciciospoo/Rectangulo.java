
package ejerciciospoo;


public class Rectangulo {
    double x;
    double y;
     public  double definirladox(double ladox) {
         this.x = ladox;
         
        return ladox;
        
        
     }
     
      public  double definirladoy(double ladoy) {
         this.y = ladoy;
         
        return ladoy;
        
        
     }
     public double calculararea() {
         double area = this.x*this.y;
         return area;
     }
     
   public double calcularperimetro() {
       double perimetro =2*this.x + 2*this.y;
       return perimetro;
   }
   }

