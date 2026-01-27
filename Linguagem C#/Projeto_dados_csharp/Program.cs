using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Curso_linguagem_csharp {
    internal class Program {
        static void Main(string[] args) {

            int idade;
            double salario, altura;
            char genero;
            string nome;
            CultureInfo CI = CultureInfo.InvariantCulture;

            idade = 20;
            salario = 5800.5;
            altura = 1.80;
            genero = 'M';
            nome = "Enzo Reis Francelli";


            Console.WriteLine(idade);
            Console.WriteLine(salario);
            Console.WriteLine(altura);
            Console.WriteLine(genero);
            Console.WriteLine(nome);

            Console.WriteLine("O funcionario " + nome + ", de idade " + idade + ", com altura " + altura + " e do genero "
                + genero + ", ganha " + salario.ToString("F2", CI) + " reais");

        }
    }
}
