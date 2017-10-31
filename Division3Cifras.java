import java.util.Scanner;

public class Division3Cifras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, result = 0;
		
		System.out.print("Ingresa el primer número: ");
		num1 = sc.nextInt();
		
		System.out.print("Ingresa el segundo número: ");
		num2 = sc.nextInt();
		
		try {
			result = num1 / num2;
			System.out.println("El resultado de la división es: " + result);
		} catch(ArithmeticException ex) {
			System.out.println("Java realizó la validación de la división y no es posible realizarla porque la división por cero (0) no existe.");
		}
	}	
}
