/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo;

/**
 *
 * @author usuario
 */
public class Comprazapatilla {
   //ATRIBUTOS
    private double precio;
    
    public void ponerPrecio (double precio) {
        this.precio = precio;
    }
    
    //MÉTODOS
    public double obtenerPrecioRebajado (int rebaja) {
    
        double precioRebajado = this.precio;
        
        double cantidadRebajada = this.precio*rebaja/100;
    
    
        precioRebajado = this.precio - cantidadRebajada;
     return precioRebajado;
     }
}
