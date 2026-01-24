package curso_linguagem_java;

import java.util.Locale;
import java.util.Scanner;

public class valores{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int v1,v2,v3;
        
        System.out.print("Digite o primeiro valor: ");
        v1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        v2 = sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        v3 = sc.nextInt();
        
        if(v1<=v2 && v1<=v3) {
        	System.out.print("\nO MENOR VALOR EH "+v1);
        }else if(v2<=v1 && v2<=v3) {
        	System.out.print("\nO MENOR VALOR EH "+v2);
        }else if(v3<=v1 && v3<=v2) {
        	System.out.print("\nO MENOR VALOR EH "+v3);
        }else{
        	System.out.print("VALOR INVALIDO!");
        }
        
        sc.close();
    }
}