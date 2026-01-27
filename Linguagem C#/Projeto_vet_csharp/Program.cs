using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;

namespace Projeto_vet_csharp {
    internal class Program {
        static void Main(string[] args) {

            int n, i;

            Console.Write("Quantos nomes serao digitados? ");
            n = int.Parse(Console.ReadLine());

            String[] vet = new string[n];

            for(i=0; i<n; i++) {
                Console.Write("Digite o nome " + i+1 + ": ");
                vet[i] = Console.ReadLine();
            }

            Console.Write("\n");
            Console.WriteLine("NOMES DIGITADOS: ");
            for(i=0; i<n; i++) {
                Console.WriteLine(vet[i]);
            }

        }
    }
}
