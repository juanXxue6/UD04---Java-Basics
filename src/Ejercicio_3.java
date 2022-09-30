
public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int X = 23;
		int Y = 98;
		double N = 12.51;
		double M = 82.64;
		
		System.out.println("Valor de las variables");
		System.out.println(X);
		System.out.println(Y);
		System.out.println(N);
		System.out.println(M);
		
		System.out.println("Resultados operaciones con enteros");
		System.out.println("Suma: "  +  (X + Y));
		System.out.println("Resta: " + (X - Y));
		System.out.println("Multiplicacion: " + (X * Y));
		System.out.println("Division: " + (X / Y));
		System.out.println("Resto:"  + (X % Y));
		
		
		System.out.println("Resultados operaciones con doubles");
		System.out.println("Suma: "  +  (N + M));
		System.out.println("Resta: " + (N - M));
		System.out.println("Multiplicacion: " + (N * M));
		System.out.println("Division: " + (N / M));
		System.out.println("Resto:"  + (N % M));
		
		
		System.out.println("Operaciones mixtas");
		System.out.println("Suma: "  +  (X + N));
		System.out.println("Division: " + (Y / M));
		System.out.println("Resto:"  + (Y % M));

		
		System.out.println("Doble cada variable");
		System.out.println(X * 2);
		System.out.println(Y * 2);
		System.out.println(N * 2);
		System.out.println(M * 2);

		
		System.out.println("Suma de las variables: " + (X+Y+M+N));

		System.out.println("Multiplicacion de todas las variables: " + (X*Y*M*N));

	
	}

}
