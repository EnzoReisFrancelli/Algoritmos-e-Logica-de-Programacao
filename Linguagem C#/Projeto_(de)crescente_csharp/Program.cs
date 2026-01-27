using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Projeto__de_crescente_csharp {
    internal class Program {
        static void Main(string[] args) {

            int v1, v2;

            Console.WriteLine("Digite um valor: ");
            v1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Digite outro valor: ");
            v2 = int.Parse(Console.ReadLine());

            Console.WriteLine("\n");
            if (v1 > v2) {
                Console.Write("DECRESCENTE!");
            }else if (v2 > v1) {
                Console.Write("CRESCENTE!");
            } else if(v1 == v2) {
                Console.Write("VALORES IGUAIS!");
            }

        }
    }
}
