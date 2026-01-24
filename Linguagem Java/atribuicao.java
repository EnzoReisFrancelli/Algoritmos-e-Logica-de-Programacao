package curso_linguagem_java;

import java.util.Locale; 

public class atribuicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		
		int idade;
		char genero;
		double salario, altura;
		String nome;
		
		idade = 20;
		salario = 6100;
		altura = 1.80;
		genero = 'M';
		nome = "Enzo Reis Francelli";
		
		System.out.println("DADOS DA PESSOA: ");
		System.out.println("\n");
		System.out.println("IDADE = " + idade);
		System.out.println("SALARIO = " + salario);
		System.out.println("ALTURA = " + altura);
		System.out.println("GENERO = " + genero);
		System.out.println("NOME = " + nome);
		System.out.println("\n");
		System.out.println("O " + nome + " tem " + idade + " anos, sua altura eh de " + String.format("%.2f", altura) + ", seu genero eh "
				+ genero + " e ele ganha " + String.format("%.2f", salario) + " reais por mes.");
		
	}

}
