import java.util.Scanner;

public class CompararApellidos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String apellido1, apellido2;
		
		System.out.print("Ingresa el primero apellido: ");
		apellido1 = sc.nextLine();
		
		System.out.print("Ingresa el segundo apellido: ");
		apellido2 = sc.nextLine();
		
		if (apellido1.equals(apellido2)) {
			System.out.println("Los apellidos son iguales");
		} else {
			System.out.println("Los apellidos son diferentes");
		}
	}
}
