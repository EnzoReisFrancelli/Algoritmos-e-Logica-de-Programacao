using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Projeto_menor3_csharp {
    internal class Program {
        static void Main(string[] args) {

            int x, y, z;

            Console.Write("Digite o primeiro valor: ");
            x = int.Parse(Console.ReadLine());
            Console.Write("Digite o segundo valor: ");
            y = int.Parse(Console.ReadLine());
            Console.Write("Digite o terceiro valor: ");
            z = int.Parse(Console.ReadLine());

            Console.Write("\n");
            if (x <= y && x <= z) {
                Console.Write("O MENOR VALOR EH " + x);
            } else if (y <= x && y <= z) {
                Console.Write("O MENOR VALOR EH " + y);
            } else if (z <= x && z <= y) {
                Console.Write("O MENOR VALOR EH " + z);
            }


        }
    }
}
