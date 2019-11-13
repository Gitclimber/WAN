/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenjava1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio1a {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a;
        int i;
        int h;
        System.out.println("Entregue el numero  ");
		a = entrada.nextInt();
                //bucle para generar el asterisco
                for(i=0;i<a;i++){
                     //iterador de espacio
                    if(i>0){
                        //bucle para generar el espacio
                        for(h=0;h<i;h++){
                        System.out.println(" ");
                    }
                }
                     System.out.println("*");
                    }
                    
                }
    }
    

