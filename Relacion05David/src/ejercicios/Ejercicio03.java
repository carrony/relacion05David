package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Dado un array de tamaño (N,M) de reales, decir cuántos elementos
		 *  tiene igual a un número A dado.
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
		
		System.out.println("Introduce el numero a comprobar");
		double num = teclado.nextDouble();
		
		int veces = FuncionesMatrices.cuantaVeces(matriz, num);
		System.out.printf("El numero %.2f se repite %d veces en la matriz",
				num,veces);

	}

}
