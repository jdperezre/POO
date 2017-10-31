import java.util.Scanner;

public class Temperatura {
	int [] temperaturas;
	
	public Temperatura(int [] temperaturas) {
		this.temperaturas = temperaturas;
	}
	
	public int diasMayorTemperatura() {
		int cont = 0;
		for (int temperatura : temperaturas) {
			if (temperatura > 30) cont++;
		}
		return cont;
	}
	
	public static void main(String[] args) {
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		Scanner sc = new Scanner(System.in);
		int [] temperaturas = new int[7];
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Ingresa la temperatura del dia " + dias[i] + " en °C: ");
			temperaturas[i] = sc.nextInt();
		}
		
		Temperatura temp = new Temperatura(temperaturas);
		System.out.print("El número de dias con una temperatura mayor de 30°C es de ");
		System.out.println(temp.diasMayorTemperatura() + " dias");
	}
}
