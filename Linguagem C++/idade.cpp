#include <bits/stdc++.h>

using namespace std;

int main(){

    string nome1, nome2;
    int idade1, idade2;
    double media;

    cout << "Dados da primeira pessoa: " << endl;
    cout << "Nome da pessoa 1: ";
    getline(cin, nome1);
    cout << "Idade da pessoa 1: ";
    cin >> idade1;
    cout << "\n" << endl;
    cout << "Dados da segunda pessoa: " << endl;
    cout << "Nome da pessoa 2: ";
    cin.ignore(INT_MAX, '\n');
    getline(cin, nome2);
    cout << "Idade da pessoa 2: ";
    cin >> idade2;

    media = (idade1 + idade2) / 2;

    cout << "\n" << endl;
    cout << "A IDADE MEDIA DE " << nome1 << " e " << nome2 << " EH DE " << media << "ANOS!" << endl;


    return 0;
}
