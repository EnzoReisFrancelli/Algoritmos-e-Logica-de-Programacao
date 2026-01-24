package curso_linguagem_java;

import java.util.Locale;
import java.util.Scanner;

public class teste_maior{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        double x, y;
        
        System.out.print("Digite o valor 1: ");
        x = sc.nextDouble();
        System.out.print("Digite o valor 2: ");
        y = sc.nextDouble();
        
        
        while(x != y) {
        	if(y<x) {
            	System.out.print("\nDECRESCENTE!");
            }else{
            	System.out.print("\nCRESCENTE!");
            }
        	System.out.print("\nDigite outros dois valores: ");
            x = sc.nextDouble();
            y = sc.nextDouble();
        }
        
        
        sc.close();
    }
}