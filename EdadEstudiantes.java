import java.util.Scanner;
import java.util.Arrays;

public class EdadEstudiantes {
	public static void main(String[] args) {
		int edades[] = new int[20];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < edades.length; i++) {
			System.out.print("Ingresa la edad del estudiantes #" + (i + 1) + ": ");
			edades[i] = sc.nextInt();
		}
		
		Arrays.sort(edades);
		System.out.println("El listados de las edades de los estudiantes en orden ascendentes es:");
		for (int edad : edades) {
			System.out.println(edad);
		}
	}
}
