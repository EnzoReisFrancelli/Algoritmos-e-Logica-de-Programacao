package curso_linguagem_java;

import java.util.Locale;
import java.util.Scanner;

public class vet { 
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Quantos nomes serao digitados: ");
        n = sc.nextInt();
        sc.nextLine();
        
        String[] nomes = new String[n];
        
        for(int i = 0; i < n; i++) { 
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine(); 
        }
        
        System.out.println("\nNOMES DIGITADOS:");
        for(int i = 0; i < n; i++) {
            System.out.println(nomes[i]);
        }
        
        sc.close();
    }
}