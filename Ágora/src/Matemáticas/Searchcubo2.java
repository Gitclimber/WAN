package Matemáticas;

public class Searchcubo2 {

	public static void restrictedcuboid() {
		
		int a;
		int resultado = 0;
		a = 0;
		int T=0;
		while  ( resultado< 3000) {
			System.out.println(a);
			a++;
		resultado = (int)Math.pow(a, 2);
		
		 T=(int) Math.pow(a, 3);
		 if (T%5 == 0) {
		System.out.println(T);
	}
		 else
			 System.out.println("Excluido");
	
}
}
}
