package curso_linguagem_java;

import java.util.Locale;
import java.util.Scanner;

public class mtz{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, m, i, j;
		
		System.out.print("Qual é o numero de linhas da matriz: ");
		n = sc.nextInt();
		System.out.print("Qual é o numero de colunas da matriz: ");
		m = sc.nextInt();
		
		double[][] mtz = new double[n][m];
		
		for(i=0; i<n; i++) {
			for(j=0; j<m; j++) {
				System.out.println("Elemento [" + i + "," + j + "]: ");
				mtz[i][j] = sc.nextDouble();
			}
		}
		
		System.out.print("\nMATRIZ DIGITADADA: ");
		for(i=0; i<n; i++) {
			for(j=0; j<m; j++) {
				System.out.println(mtz[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
