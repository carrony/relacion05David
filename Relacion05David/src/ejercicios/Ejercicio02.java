package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Dado un array de tamaño (N,M) de enteros, decir si todos sus 
		 * elementos son cero.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Filas: ");
		int filas = teclado.nextInt();
		
		System.out.println("Columnas: ");
		int cols = teclado.nextInt();
		
		System.out.println("Introduce la matriz");
		int matriz[][] = new int[filas][cols];
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("La matriz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		boolean esNula = FuncionesMatrices.sonTodosCero(matriz);
		if (esNula) {
			System.out.println("La matriz contiene sólo ceros");
		} else {
			System.out.println("Hay al menos algún elemento en la matriz que no es cero");
		}
		
		
		
		
	}

}
