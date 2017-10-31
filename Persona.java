import javax.swing.*;

public class Persona {
	private String nombre;
	private int edad;
	
	public void inicializar() {
    	nombre = JOptionPane.showInputDialog(null,"Ingresa el nombre:");
    	edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la edad:"));
	}
	
	public void imprimir() {
		System.out.println("Los datos son: ");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
	
	public void esMayorEdad() {
		if (edad >= 18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
		}
	}
	
	public static void main(String[] args) {
		Persona p = new Persona();
		p.inicializar();
		p.imprimir();
		p.esMayorEdad();
	}
}
