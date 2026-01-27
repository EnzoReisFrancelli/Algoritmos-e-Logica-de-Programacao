using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;
using Microsoft.Win32;

namespace Projeto_calculo_csharp {
    internal class Program {
        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;

            double b, altura, area, perimetro, diagonal;

            Console.Write("Digite o valor da base: ");
            b = double.Parse(Console.ReadLine(), CI);
            Console.Write("Digite o valor da altura: ");
            altura = double.Parse(Console.ReadLine(), CI);

            area = b * altura;
            perimetro = 2 * (b + altura);
            diagonal = Math.Sqrt(Math.Pow(b, 2) + Math.Pow(altura,2));

            Console.Write("\n");
            Console.WriteLine("BASE = "+b.ToString("F1", CI));
            Console.WriteLine("ALTURA = "+altura.ToString("F1", CI));
            Console.WriteLine("AREA = " + area.ToString("F2", CI));
            Console.WriteLine("PERIMETRO = "+perimetro.ToString("F2", CI));
            Console.WriteLine("DIAGONAL = "+diagonal.ToString("F2", CI));


        }
    }
}
