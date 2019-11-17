/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect1;

/**
 *
 * @author emilio
 */
public class Inversorchar {
    public static void main(String[] args) {
        
     String palabra="", palabraInvertida="";
     int longitudpalabra = 0;
     Scanner entrada = new Scanner(System.in);
     
        System.out.print("Escribe una palabra o frase: ");
        palabra = entrada.nextLine();
        
        longitudPalabra = palabra.length();
        
        while(longitudPalabra != 0){
            palabraInvertida += palabra.susbstring(longitudPalabra -1 , longitudPalabra);
            longitudPalabra--;
        }
        System.out.println("Palabra invertida: " + palabraInvertida);
        System.out.println("");
    }
    
}
