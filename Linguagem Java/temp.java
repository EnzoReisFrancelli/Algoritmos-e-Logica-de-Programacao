package curso_linguagem_java;

import java.util.Locale;
import java.util.Scanner;

public class temp{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		double C, F;
		
		do {
			System.out.print("Digite uma temperatura em CELSIUS: ");
			C = sc.nextDouble();
			F = 9.0 * C / 5.0 + 32.0;
			System.out.println("Temperatura equivalente em FAHRENHEIT: " +String.format("%.1f", F));
			System.out.print("Deseja repetir (S/N)? ");
			resp = sc.next().charAt(0);
		} while(resp == 'S');
		
		
		sc.close();
	}
}
