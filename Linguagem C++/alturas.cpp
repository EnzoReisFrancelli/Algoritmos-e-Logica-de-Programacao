#include <bits/stdc++.h>

using namespace std;

int main(){

    int n, nmenores, soma;
    double alturaMedia, porcentagem ;

    cout << "Quantas pessoas serao digitadas? ";
    cin >> n;

    string nomes [n];
    int idades [n];
    double alturas [n];

    for(int i=0; i<n; i++){
        cout << "Dados da " << i+1 << "a pessoa: " << endl;
        cout << "Nome: ";
        cin.ignore(INT_MAX, '\n');
        getline(cin, nomes[i]);
        cout << "Idade: ";
        cin >> idades[i];
        cout << "Altura: ";
        cin >> alturas[i];
    }

    soma = 0;
    for(int i=0; i<n; i++){
        soma = soma = alturas[i];
    }

    alturaMedia = (double)soma / n;

    cout << "\n" << endl;
    cout << "MEDIA DAS ALTURAS = " << alturaMedia << endl;

    nmenores = 0;
    for(int i=0; i<n; i++){
        if(idades[i] < 16){
            nmenores = nmenores + 1;
        }
    }

    porcentagem = ( (double) nmenores * 100) / n;

    cout << "\n" << endl;
    cout << fixed << setprecision(2);
    cout << "A PORCENTAGEM DE MENORES DE 16 ANOS EH DE " << porcentagem << "%" << endl;

    return 0;
}
