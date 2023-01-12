package ejercicios;

import java.util.Scanner;

public class Ejercicio5bis {

	public static void main(String[] args) {
		/*
		 * Dado un array de tamaño (N,M) de reales, si una matriz es la matriz diagonal.
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Filas: ");
		int filas = teclado.nextInt();
		
		System.out.println("Introduce la matriz");
		double matriz[][] = new double[filas][filas];
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("La matriz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		if (FuncionesMatrices.esTriangularInferior(matriz) &&
			FuncionesMatrices.esTriangularSuperior(matriz)) {
			System.out.println("Es la matriz diagonal o nula");
		} else if (FuncionesMatrices.esTriangularInferior(matriz)) {
			System.out.println("Es triangular inferior");
		} else if (FuncionesMatrices.esTriangularSuperior(matriz)){
			System.out.println("Es triangular superior");
		} else {
			System.out.println("Es una matriz normal");
		}
		
		

	}

}
