package ejercicios;

import java.util.Scanner;

public class FuncionesMatrices {

	public static void pedirMatriz(int matriz[][]) { 
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("Introduce el elemento (%d,%d)", i ,j);
				matriz[i][j]= teclado.nextInt();
			}
		}
	}
	
	public static void mostrarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
