using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;
using System.Net.Http.Headers;

namespace Projeto_diagonal_negativos_csharp {
    internal class Program {
        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;

            int n, qtdNegativos;

            Console.Write("Qual eh a ordem da matriz? ");
            n = int.Parse(Console.ReadLine());

            int[,] mtz = new int[n, n];

            Console.Write("\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    Console.Write("Elemento [" + i + "," + j + "]: ");
                    mtz[i, j] = int.Parse(Console.ReadLine());
                }
            }

            Console.Write("\n");
            Console.WriteLine("DIAGONAL PRINCIPAL: ");
            for (int i = 0; i < n; i++) {
                Console.Write(mtz[i, i] + " ");
            }

            Console.Write("\n");
            qtdNegativos = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mtz[i, j] < 0) {
                        qtdNegativos = qtdNegativos + 1;
                    }
                }
            }

            Console.Write("\n");
            Console.Write("QUANTIDADE DE NEGATIVOS: "+qtdNegativos);

        }
    }
}
