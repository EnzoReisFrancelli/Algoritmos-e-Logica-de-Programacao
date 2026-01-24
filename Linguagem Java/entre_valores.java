package curso_linguagem_java;

import java.util.Locale;
import java.util.Scanner;

public class entre_valores{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int v1,v2,soma,troca;
		
		System.out.print("Digite o valor 1: ");
		v1 = sc.nextInt();
		System.out.print("Digite o valor 2: ");
		v2 = sc.nextInt();
		
		if(v1>v2) {
			troca = v1;
			v1 = v2;
			v2 = troca;
		}
		
		soma = 0;
		for(int i=v1+1; i<v2; i++) {
			if(i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.print("\nSOMA DOS VALORES IMPARES ENTRE OS DIGITADOS = "+ soma);
		
		sc.close();
	}
}