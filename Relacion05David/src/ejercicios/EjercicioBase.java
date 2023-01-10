package ejercicios;

import java.util.Scanner;

public class EjercicioBase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas: ");
		int filas = teclado.nextInt();
		
		System.out.println("Introduce el número de columnas: ");
		int columnas = teclado.nextInt();
		
		// asignamos memoria a la matriz
		int matriz[][] = new int [filas][columnas];
		System.out.println("Introduce la matriz");
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("Tu matriz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		
		
		

	}

}
