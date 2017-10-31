import java.util.Scanner; 

public class CalculoIva {

	static Scanner entrada = new Scanner(System.in);
    static double valor;
    
	public static void main(String[] args) {
		    	
		        System.out.println("Ingrese Precio: ");
		        Iva operacion = new Iva(entrada.nextDouble());
		        operacion.calcularIva();
		        operacion.calcularValorProducto();
		        operacion.mostrar();
		    }
		}


		class Iva{
		    double precio, valorIva, valorProducto;
		    Iva(double valor){
		        precio = valor;        
		    }
		    public void calcularIva(){
		        valorIva = precio * .16;
		    }
		    public void calcularValorProducto(){
		        valorProducto = precio + valorIva;
		    }
		    public void mostrar() {
		        System.out.println("\nIva = " + valorIva + "\nProducto Sin Iva = "+ precio + "\nValor Producto Con Iva = "+ valorProducto);
		    }
		   

}
