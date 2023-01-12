package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		/*
		 * Dada un array de tamaño (M,N) de reales, almacenarlo sobre otro array de tamaño (N,M) de forma transpuesta, es decir, el elemento (1,2) del primer array se almacenará en el elemento (2,1) del segundo.
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
		
		System.out.println("La matriz traspuesta es");
		FuncionesMatrices.mostrarMatriz(
				FuncionesMatrices.traspuesta(matriz));
		
		
		teclado.close();
		
	}

}
