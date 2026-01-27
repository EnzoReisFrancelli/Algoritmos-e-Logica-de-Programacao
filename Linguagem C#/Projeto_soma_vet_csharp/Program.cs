using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;

namespace Projeto_soma_vet_csharp {
    internal class Program {
        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;

            int n;
            double soma, media;

            Console.Write("Quantos numeros serao digitados? ");
            n = int.Parse(Console.ReadLine());

            double[] numeros = new double[n];

            Console.Write("\n");
            for (int i=0; i<n; i++) {
                Console.Write("Digite um numero: ");
                numeros[i] = double.Parse(Console.ReadLine());
            }

            soma = 0;
            for (int i = 0; i < n; i++) {
                soma = soma + numeros[i];
            }

            media = soma / (double)n;

            Console.Write("\n");
            Console.Write("VALORES APRESENTADOS: ");
            for (int i = 0; i < n; i++) {
                Console.Write(numeros[i] + " ");
            }

            Console.Write("\nSOMA: "+soma.ToString("F2", CI));
            Console.Write("\nMEDIA: " +media.ToString("F2", CI));

        }
    }
}
