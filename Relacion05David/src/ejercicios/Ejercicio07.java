package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		/*
		 * Dado un array de tamaño (N,M) de reales, calcula la media aritmética
		 *  de sus valores.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Filas: ");
		int filas = teclado.nextInt();
		
		System.out.println("Columnas: ");
		int cols = teclado.nextInt();
		
		System.out.println("Introduce la matriz");
		double matriz[][] = new double[filas][cols];
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("La matriz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		System.out.printf("La media de los elementos de la matriz es %.2f",
				FuncionesMatrices.mediaMatriz(matriz));
		
	}

}
