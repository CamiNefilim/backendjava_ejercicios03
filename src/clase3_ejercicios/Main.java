package clase3_ejercicios;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		despliegaMenu();
	}
	
	private static void despliegaMenu() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\nMenú:");
			System.out.println("1. Cree un arreglo con N enteros aleatorios.");
			System.out.println("2. Calcule el promedio de un arreglo de enteros.");
			System.out.println("3. Obtenga el mayor valor de un arreglo de enteros.");
			System.out.println("4. Obtenga el menor valor de un arreglo de enteros.");
			System.out.println("5. Calcule el rango de un arreglo de enteros.");
			System.out.println("6. Calcule la desviación estándar de un arreglo de enteros.");
			System.out.println("7. Obtenga el coeficiente de variación de un arreglo de enteros.");
			System.out.println("8. Calcule una matriz de que represente la diferencia entre los elementos de un arreglo.");
			System.out.println("9. Salir");
			String opcion = scanner.nextLine();
			
			switch(opcion) {
			case "1":
				arregloNumerosAleatorios();
				break;
			case "2":	
				calculaPromedio();
				break;
			case "3":	
				obtenerMayorNumero();
				break;
			case "4":	
				obtenerMenorNumero();
				break;
			case "5":	
				obtenerRango();
				break;
			case "9":
				System.out.println("Cierre del sistema.");
				return;
			default:
				System.out.println("Ingrese una opción valida.");
			}
		} while(true);
	}
	
	private static void arregloNumerosAleatorios() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random aleatorio = new Random();
		int largo = aleatorio.nextInt(100);
		for(int i=0; i<largo; i++) {
			numeros.add(aleatorio.nextInt(100));			
		}
		System.out.println("Array de numeros: " + numeros);
	}
	
	private static void calculaPromedio() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random aleatorio = new Random();
		int largo = aleatorio.nextInt(10)+1;
		int suma = 0;		
		for(int i=0; i<largo; i++) {
			int numero = aleatorio.nextInt(100);
			numeros.add(numero);		
			suma += numero;
		}
		double promedio = (double)suma/largo;
		System.out.println("Array de numeros: " + numeros);
		System.out.println("Promedio: " + promedio);
	}
	
	private static void obtenerMayorNumero() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random aleatorio = new Random();
		int largo = aleatorio.nextInt(10)+1;
		int mayor = 0;		
		for(int i=0; i<largo; i++) {
			int numero = aleatorio.nextInt(100)+1;
			numeros.add(numero);
			if(numero>mayor) {
				mayor = numero;
			}
		}		
		System.out.println("Array de numeros: " + numeros);
		System.out.println("El número mayor es: " + mayor);
	}
	
	private static void obtenerMenorNumero() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random aleatorio = new Random();
		int largo = aleatorio.nextInt(10)+1;	
		int menor = Integer.MAX_VALUE;
		for(int i=0; i<largo; i++) {
			int numero = aleatorio.nextInt(100)+1;
			numeros.add(numero);
			if(numero<menor) {
				menor = numero;
			}
		}		
		System.out.println("Array de numeros: " + numeros);
		System.out.println("El número menor es: " + menor);
	}
	
	private static void obtenerRango() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random aleatorio = new Random();
		int largo = aleatorio.nextInt(10)+1;	
		int mayor = 0;
		int menor = Integer.MAX_VALUE;
		for(int i=0; i<largo; i++) {
			int numero = aleatorio.nextInt(100)+1;
			numeros.add(numero);
			if(numero>mayor) {
				mayor = numero;
			}
			if(numero<menor) {
				menor = numero;
			}
		}	
		int rango = mayor - (menor == Integer.MAX_VALUE ? 0 : menor);
		System.out.println("Array de numeros: " + numeros);
		System.out.println("El rango es: " + rango);
	}
	
	private static void obtenerDesviacionTipica() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random aleatorio = new Random();
		int largo = aleatorio.nextInt(10)+1;
		int suma = 0;		
		for(int i=0; i<largo; i++) {
			int numero = aleatorio.nextInt(100);
			numeros.add(numero);		
			suma += numero;
		}
		double promedio = (double)suma/largo;
		System.out.println("Array de numeros: " + numeros);
		System.out.println("Promedio: " + promedio);
	}

}
