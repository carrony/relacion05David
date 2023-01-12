package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * Incializar una matriz a un valor dado
		 */
		Scanner teclado = new Scanner(System.in);
		int filas=0;
		do {
			System.out.println("Filas (debe er positivo): ");
			filas = teclado.nextInt();
		}while(filas<=0);
		
		
		System.out.println("Columnas: ");
		int cols = teclado.nextInt();
		while(cols<=0) {
			System.out.println("Debe ser mayor que cero ");
			System.out.println("Cols:");
			cols = teclado.nextInt();
		}
		
		
		int matriz[][]=new int[filas][cols];
		
		System.out.println("Introduce el valor al que quieres incializar la matriz");
		int valor = teclado.nextInt();
		
		FuncionesMatrices.inicializar(matriz, valor);
		
		System.out.println("Tu matriz incializada es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		
		
		
		
		
		
		

	}

}
