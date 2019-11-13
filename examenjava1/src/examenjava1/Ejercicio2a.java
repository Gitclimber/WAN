/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenjava1;

/**
 *
 * @author usuario
 */
public class Ejercicio2a {
    public static void main (String[] args){
        int a;
        a=0;
        int s;
        s=0;
        int t;
         int numero = 0;
        for (int i =0; i<100 ;i++) {
          numero = (int) (Math.random()*100+200);
          if(numero%3 ==0){
              a = a+1;
              s= s+numero;
          System.out.print( "  " + numero + "  ");
          }
    }
        System.out.println("\n");
        System.out.println("Hay " + a +" numeros multiplos de 3");
        t=s/a;
        System.out.println("La media de todos esos numero es " + t + "\n");
    }
}
