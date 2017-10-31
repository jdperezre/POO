import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota1, nota2, nota3, prom;
		
		System.out.print("Ingresa nota1: ");
		nota1 = sc.nextInt();
		
		System.out.print("Ingresa nota2: ");
		nota2 = sc.nextInt();
		
		System.out.print("Ingresa nota3: ");
		nota3 = sc.nextInt();
		
		prom = (nota1 + nota2 + nota3) / 3;
		if (prom >=7) {
			System.out.println("Promocionado");
		} else if (prom >= 4) {
			System.out.println("Regular");
		} else {
			System.out.println("Reprobado");
		}
	}
}
