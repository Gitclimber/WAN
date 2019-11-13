/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Perro {
    
    //ESTADO
    String raza;
    int estatura; // en cms
    double peso;
    String color;
    int edad;
    char sexo;       //M: Macho, H: hembra
    boolean castrado;
    
    
    //CIMPORTAMIENTO
    void ladrar () {
        System.out.println("Guau");
    }
    
    void dormir () {
        System.out.println("Zzzzzz");
    }
    
    void comer () {
        System.out.println("ÑAM ÑAM");
    }
    
}
