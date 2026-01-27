using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;

namespace Projeto_idades_csharp {
    internal class Program {
        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;

            int n, cont;
            double media;

            Console.Write("Quantas idades serão digitadas? ");
            n = int.Parse(Console.ReadLine());

            int[] idades = new int[n];

            Console.Write("\n");
            for (int i=0; i<n; i++) {
                Console.Write("Digite a idade " + (i+1) + ": ");
                idades[i] = int.Parse(Console.ReadLine());
            }

            cont = 0;
            for (int i = 0; i < n; i++) {
                cont = cont + idades[i];
            }

            media = (double)cont / n;

            Console.Write("\n");
            Console.Write("A MEDIA DAS IDADES DIGITADAS EH: "+media.ToString("F2", CI));

        }
    }
}
