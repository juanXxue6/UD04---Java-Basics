
public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a = 31;
			int b = 95;
			int c  = 66;
			int d = 48;
		
			
			System.out.println("Valores originales: ");
			
			System.out.println("Valor a: " + a);
			System.out.println("Valor b: " + b);
			System.out.println("Valor c: " + c);
			System.out.println("Valor d: " + d); 
			
			b = c;
			c = a;
			a = d;
			d = b;
			
		System.out.println("Valores nuevos: ");
			
			System.out.println("Valor a: " + a);
			System.out.println("Valor b: " + b);
			System.out.println("Valor c: " + c);
			System.out.println("Valor d: " + d); 
			
	}

}
