package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		/*
		 * Dada una matriz de (N,M) de enteros devolver un vector con las
		 *  medias de las columnas, 
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
		
		double resultado [] =FuncionesMatrices.mediaPorColumnas(matriz);
		System.out.println("LAs medias son");
		FuncionesVectores.mostrar_vector(resultado);
		
		teclado.close();
		
	}

}
