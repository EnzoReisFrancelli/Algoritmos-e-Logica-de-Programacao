package curso_linguagem_java;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class calculo{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, perimetro, diagonal, area;
		
		System.out.print("Digite a base: ");
		base = sc.nextDouble();
		System.out.print("Digite a altura: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
		
		System.out.print("\nDADOS APRESENTADOS E CALCULADOS:\n");
		System.out.println("BASE = "+ String.format("%.1f", base));
		System.out.println("ALTURA = "+ String.format("%.2f", altura));
		System.out.println("AREA = "+ String.format("%.4f", area));
		System.out.println("PERIMETRO = "+ String.format("%.4f", perimetro));
		System.out.println("DIAGONAL = "+ String.format("%.4f", diagonal));
		
		sc.close();
	}
}