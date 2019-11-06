package Matemáticas;

import javax.swing.JOptionPane;

public class Polinomioraiz {

	public static void main(String[] args) {
		String numero1, numero2, numero3, opcion;
		
		double a, b, c, d=0, e=0, f=0, g=0, h=0, opcion2=0;
		do {
		 numero1 = JOptionPane.showInputDialog("Escriba el coficiente a ");
		 numero2 = JOptionPane.showInputDialog("Escriba el coficiente b ");
		 numero3 = JOptionPane.showInputDialog("Escriba el coficiente c ");
		 
		 a = Integer.parseInt(numero1);
			b = Integer.parseInt(numero2);
			c = Integer.parseInt(numero3);
			
			d=((b*b)-(4*a*c));
			
			e = ((2)*(a));
			
			if (e<=0) {
				opcion = JOptionPane.showInputDialog("\n el coeficiente a" + " negativo, no se puede dividir / 0, repetir 1-Si 2-No");
			
						opcion2 = Integer.parseInt(opcion);
			
			}
			else {
				
				
				if (d<=0) {
					opcion = JOptionPane.showInputDialog("\n no existe raiz de un " + " numero negativo, Repetir 1-Si 2-No: ");
				}
				else {
					h = (int) Math.sqrt(d);
					
					f = (((-b)+(h))/e);		
					g = (((-b)-(h))/e);
					
					JOptionPane.showMessageDialog(null, "La raiz x1_:"+f, "resultado",JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "La raiz x1_:"+g, "resultado",JOptionPane.INFORMATION_MESSAGE);
				opcion=JOptionPane.showInputDialog("\\n Repetir? 1-Si 2-No:");
				opcion2 = Integer.parseInt(opcion);
				}
			}
		
		
		
		}while(opcion2==1);

}
}
