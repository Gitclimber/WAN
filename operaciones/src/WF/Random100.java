
package WF;


public class Random100 {
    
    public static void main(String[] args) {
        int numero = 0;
        for (int i =0; i<100 ;i++) {
          numero = (int) (Math.random()*100+1);
          System.out.print( "  " + numero + "  ");
        }
        
    }
}
    
    
}
