package curso_linguagem_java;

import java.util.Locale;
import java.util.Scanner;

public class soma_vet{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos numeros serao digitados? ");
		n = sc.nextInt();
		sc.nextLine();
		
		double[] vet = new double[n];
		
		for(int i=0; i<n; i++){
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.print("\n");
		System.out.print("VALORES: ");
		for(int i=0; i<n; i++){
			System.out.printf(String.format("%.1f", vet[i]));
			System.out.print("\n");
		}
		
		
		soma = 0;
		for(int i=0; i<n; i++){
			soma = soma + vet[i];
		}
		System.out.print("\nSOMA: "+String.format("%.2f", soma));
		
		System.out.print("\n");
		media = soma / (double)n;
		System.out.print("MEDIA: "+String.format("%.2f", media));
		
		
		sc.close();
	}
}