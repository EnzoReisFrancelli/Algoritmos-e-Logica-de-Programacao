#include <bits/stdc++.h>

using namespace std;

int main(){

    int idade1, idade2;
    string nome1, nome2;
    double salario1, salario2;
    char sexo1, sexo2;

    cout << "Digite o nome da primeira pessoa: ";
    getline(cin, nome1);
    cout << "Digite a idade da primeira pessoa: ";
    cin >> idade1;
    cout << "Digite o salario da primeira pessoa: ";
    cin >> salario1;
    cout << "Digite o sexo da primera pessoa (M/F): ";
    cin >> sexo1;
    cout << "\n" << endl;
    cout << "Digite o nome da segunda pessoa: ";
    cin.ignore(INT_MAX, '\n');
    getline(cin, nome2);
    cout << "Digite a idade da segunda pessoa: ";
    cin >> idade2;
    cout << "Digite o salario da segunda pessoa: ";
    cin >> salario2;
    cout << "Digite o sexo da segunda pessoa (M/F): ";
    cin >> sexo2;
    cout << "\n" << endl;

    cout << "DADOS APRESENTADOS: " <<endl;

    cout << fixed << setprecision(2);
    cout << "NOME = " << nome1 << endl;
    cout << "IDADE = " << idade1 << endl;
    cout << "SALARIO = " << salario1 << endl;
    cout << "SEXO = " << sexo1 <<endl;
    cout << "\n" << endl;
    cout << "NOME = " << nome2 << endl;
    cout << "IDADE = " << idade2 << endl;
    cout << "SALARIO = " << salario2 << endl;
    cout << "SEXO = " << sexo2 << endl;


    return 0;
}
