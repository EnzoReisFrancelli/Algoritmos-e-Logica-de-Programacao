package curso_linguagem_java;

import java.util.Locale;
import java.util.Scanner;

public class dados{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario1, salario2;
		String nome1, nome2;
		int idade1, idade2;
		char sexo1, sexo2;
		
		System.out.println("Digite os dados da primeira pessoa: ");
		System.out.print("\n");
		System.out.print("Digite o nome: ");
		nome1 = sc.nextLine();
		System.out.print("Digite a idade: ");
		idade1 = sc.nextInt();
		System.out.print("Digite o salario: ");
		salario1 = sc.nextDouble();
		System.out.print("Digite o genero (M/F): ");
		sexo1 = sc.next().charAt(0);
		System.out.print("\n");
		
		System.out.println("Digite os dados da segunda pessoa: ");
		System.out.print("\n");
		System.out.print("Digite o nome: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.print("Digite a idade: ");
		idade2 = sc.nextInt();
		System.out.print("Digite o salario: ");
		salario2 = sc.nextDouble();
		System.out.print("Digite o genero (M/F): ");
		sexo2 = sc.next().charAt(0);
		System.out.print("\n");
		
		System.out.println("DADOS DA PRIMEIRA PESSOA: ");
		System.out.println("NOME = " + nome1);
		System.out.println("IDADE = " + idade1);
		System.out.println("SALARIO = " + String.format("%.2f", salario1));
		System.out.println("GENERO = " + sexo1);
		System.out.print("\n");
		
		System.out.println("DADOS DA SEGUNDA PESSOA: ");
		System.out.println("NOME = " + nome2);
		System.out.println("IDADE = " + idade2);
		System.out.println("SALARIO = " + String.format("%.2f", salario2));
		System.out.println("GENERO = " + sexo2);
		
		sc.close();
	}
	
}
	