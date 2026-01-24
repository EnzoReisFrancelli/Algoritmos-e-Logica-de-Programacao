package curso_linguagem_java;

import java.util.Locale;
import java.util.Scanner;

public class pessoas_idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n, contIdade;
        double media;
        
        System.out.print("Digite o numero de pessoas: ");
        n = sc.nextInt();
        sc.nextLine();
        
        String[] nomes = new String[n];
        int[] idades = new int[n];
        
        System.out.print("\n");
        for(int i = 0; i < n; i++) {
            System.out.print("Nome da pessoa " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade da pessoa " + (i + 1) + ": ");
            idades[i] = sc.nextInt();
            sc.nextLine();
            
            while (idades[i] < 0) {
                System.out.print("Idade invalida. Digite novamente: ");
                idades[i] = sc.nextInt();
                sc.nextLine();
            }
        }
        
        contIdade = 0;
        for(int i = 0; i < n; i++) {
            contIdade = contIdade + idades[i];
        }
        
        media = (double) contIdade / n;
        System.out.print("\nMEDIA DE IDADE DAS PESSOAS DIGITADAS =  " + String.format("%.2f", media));
        
        sc.close();
    }
}