package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * Dado un array de tamaño (N,M) de enteros, buscar el máximo valor
		 *  almacenado.
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
		
		int mayor = FuncionesMatrices.devuelveMayor(matriz);
		System.out.println("El mayor es "+mayor);
		
	}

}
