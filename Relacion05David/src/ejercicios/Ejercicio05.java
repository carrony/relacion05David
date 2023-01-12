package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Dado un array de tamaño (N,M) de reales, decir cuántos elementos
		 *  tiene igual a un número A dado.
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Filas: ");
		int filas = teclado.nextInt();
		
		System.out.println("Introduce la matriz");
		double matriz[][] = new double[filas][filas];
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("La matriz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		boolean triangular = FuncionesMatrices.esTriangularInferior(matriz);
		if (triangular) {
			System.out.println("ES triangular infrior");
		} else {
			System.out.println("NO Es triangular inferior");
		}
		
		

	}

}
