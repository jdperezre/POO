import javax.swing.*;

public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	
	public void inicializar() {
		lado1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer lado:"));
		lado2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo lado:"));
		lado3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tercer lado:"));
	}
	
	public void ladoMayor() {
		// Verificamos si el lado 1 es mayor a los demás
		if (lado1 > lado2 && lado1 > lado3) {
			System.out.println("El lado 1 es mayor con una medida de: " + lado1);
		} else if (lado2 > lado3 && lado2 > lado1) {
			// Verificamos si el lado 2 es mayor a los demás
			System.out.println("El lado 2 es mayor con una medida de: " + lado2);
		} else if (lado3 > lado1 && lado3 > lado2) {
			// Verificamos si el lado 3 es mayor a los demás
			System.out.println("El lado 3 es mayor con una medida de: " + lado3);
		} else {
			System.out.println("Ningun lado es mayor");
		}
	}
	
	public void Equilatero() {
		// Verificamos si tiene todos los lados iguales para que sea equilatero
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("El triangulo es equilatero");
		} else {
			System.out.println("El triangulo no es equilatero");
		}
	} 
	
	public static void main(String[] args) {
		Triangulo t = new Triangulo();
		t.inicializar();
		t.ladoMayor();
		t.Equilatero();
	}
}
