using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Projeto_pessoa_csharp {
    internal class Program {
        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;

            double salario1, salario2;
            string nome1, nome2;
            int idade1, idade2;
            char sexo1, sexo2;

            Console.WriteLine("DADOS DA PRIMEIRA PESSOA: ");
            Console.Write("\n");
            Console.Write("Nome da primeira pessoa: ");
            nome1 = Console.ReadLine();
            Console.Write("Idade da primeira pessoa: ");
            idade1 = int.Parse(Console.ReadLine());
            Console.Write("Sexo da primeira pessoa (M/F): ");
            sexo1 = char.Parse(Console.ReadLine());
            Console.Write("Salario da primeira pessoa: ");
            salario1 = double.Parse(Console.ReadLine(), CI);

            Console.Write("\n");
            Console.WriteLine("DADOS DA SEGUNDA PESSOA: ");
            Console.Write("\n");
            Console.Write("Nome da segunda pessoa: ");
            nome2 = Console.ReadLine();
            Console.Write("Idade da segunda pessoa: ");
            idade2 = int.Parse(Console.ReadLine());
            Console.Write("Sexo da segunda pessoa (M/F): ");
            sexo2 = char.Parse(Console.ReadLine());
            Console.Write("Salario da segunda pessoa: ");
            salario2 = double.Parse(Console.ReadLine(), CI);

            Console.Write("\n");
            Console.WriteLine("Nome 1: " + nome1);
            Console.WriteLine("Idade 1: " + idade1);
            Console.WriteLine("Sexo 1: " + sexo1);
            Console.WriteLine("Salario 1: " + salario1.ToString("F2", CI));
            Console.Write("\n");
            Console.WriteLine("Nome 2: " + nome2);
            Console.WriteLine("Idade 2: " + idade2);
            Console.WriteLine("Sexo 2: " + sexo2);
            Console.WriteLine("Salario 2: " + salario2.ToString("F2", CI));

        }
    }
}
