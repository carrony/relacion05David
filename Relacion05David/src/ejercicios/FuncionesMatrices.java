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
	
	public static void pedirMatriz(double matriz[][]) { 
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("Introduce el elemento (%d,%d)", i ,j);
				matriz[i][j]= teclado.nextDouble();
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
	
	public static void mostrarMatriz(double matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%.2f ",matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void inicializar(int matriz[][], int n) {
		for(int i = 0; i<matriz.length; i++ ) {
			for (int j=0; j<matriz[0].length; j++) {
				matriz[i][j]=n;
			}
		}
	}
	
	public static boolean sonTodosCero(int matriz[][]) {
		//boolean ceros=true;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length;j++) {
				if (matriz[i][j]!=0) {
					//ceros = false;
					return false;
				}
			}
		}
		//return ceros;
		return true;
	}
	
	
	public static int cuantaVeces(double m[][], double num) {
		int contador=0;
		
		for (int i=0; i<m.length; i++ ) {
			for (int j=0;j<m[0].length; j++) {
				if (m[i][j]==num) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	
	public static boolean esTriangularSuperior(double matriz[][]) {
		boolean triangular = true;
		if (matriz.length!=matriz[0].length || matriz.length<=1 
				|| matriz==null) {
			return false;
		}
		
		for (int i=1;i<matriz.length;i++ ) {
			for (int j=0; j<i; j++) {
				if (matriz[i][j]!=0) {
					triangular=false;
				}
			}
		}
		return triangular;
	}
	
	
	public static boolean esTriangularInferior(double matriz[][]) {
		boolean triangular = true;
		if (matriz.length!=matriz[0].length || matriz.length<=1 
				|| matriz==null) {
			return false;
		}
		
		for (int i=0;i<matriz.length-1;i++ ) {
			for (int j=i+1; j<matriz.length; j++) {
				if (matriz[i][j]!=0) {
					triangular=false;
				}
			}
		}
		return triangular;
	}
	
	
	public static int devuelveMayor(int matriz[][]) {
		int mayor=matriz[0][0];
		
		for(int i=0; i<matriz.length; i++ ) {
			for (int j=0; j<matriz[0].length; j++) {
				if (matriz[i][j] > mayor) {
					mayor= matriz[i][j];
				}
			}
		}
		return mayor;
	}
	
	public static double mediaMatriz(double matriz[][]) {
		double suma=0;
		
		for (int i=0; i<matriz.length; i++ ) {
			for (int j=0; j<matriz[0].length;j++) {
				suma=suma+matriz[i][j];
			}
		}
		return suma/(matriz.length*matriz[0].length);
	}
	
	public static double mediaMatriz(int matriz[][]) {
		int suma=0;
		
		for (int i=0; i<matriz.length; i++ ) {
			for (int j=0; j<matriz[0].length;j++) {
				suma=suma+matriz[i][j];
			}
		}
		return  suma/ (double)(matriz.length*matriz[0].length);
	}
	
	
	public static double [] mediaPorColumnas(int matriz[][]) {
		double medias [] = new double[matriz[0].length];
		int suma=0;
		
		for (int j=0; j<matriz[0].length;j++) {
			for (int i =0; i<matriz.length; i++) {
				suma=suma+matriz[i][j];
			}
			medias[j] = (double) suma/matriz.length;
			suma=0;
		}
		return medias;
	}
			
	public static double [] mediaPorFilas(int matriz[][]) {
		double medias [] = new double[matriz.length];
		int suma=0;
		
		for (int i =0; i<matriz.length; i++) {
			for (int j=0; j<matriz[0].length;j++) {
			
				suma=suma+matriz[i][j];
			}
			medias[i] = (double) suma/matriz[0].length;
			suma=0;
		}
		return medias;
	}		
			
	public static double [][] traspuesta(double matriz[][]) {
		double tras[][]=new double[matriz[0].length][matriz.length];
		
		for (int i =0; i< tras.length; i++) {
			for (int j=0; j<tras[0].length; j++) {
				tras[i][j]=matriz[j][i];
			}
		}
		return tras;
	}
			
	public static double [][] traspuestav2(double matriz[][]) {
		double tras[][]=new double[matriz[0].length][matriz.length];
		
		for (int i =0; i< matriz.length; i++) {
			for (int j=0; j<matriz[0].length; j++) {
				tras[j][i]=matriz[i][j];
			}
		}
		return tras;
	}
}
