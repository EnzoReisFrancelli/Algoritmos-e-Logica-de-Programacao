package curso_linguagem_java;

import java.util.Locale;
import java.util.Scanner;

public class diagonal_negativos{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,i,j,contNegativos;
		
		System.out.print("Qual é a ordem da matriz? ");
		n = sc.nextInt();
		sc.nextLine();
		
		double[][] mtz = new double[n][n];
		
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.print("Elemento [" + i + "," + j +"]: ");
				mtz[i][j] = sc.nextDouble();
			}
		}
		System.out.print("\n");
		
		System.out.print("DIAGONAL PRINCIPAL: ");
		for(i=0; i<n; i++) {
			System.out.print(mtz[i][i] + " ");
		}
		System.out.print("\n");
		
		contNegativos = 0;
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				if(mtz[i][j] < 0) {
					contNegativos = contNegativos + 1;
				}
			}
		}
		
		System.out.print("QUANTIDADE DE NUMEROS NEGATIVOS: "+contNegativos);
		
		sc.close();
	}
}