#include <bits/stdc++.h>

using namespace std;

int main(){

    int v1, v2, soma, troca, i;

    cout << "Digite dois valores: " << endl;
    cin >> v1;
    cin >> v2;

    if(v1 > v2){
        troca = v1;
        v1 = v2;
        v2 = troca;
    }

    soma = 0;
    for (i=v1+1; i<v2; i++){
        if(i%2 != 0){
            soma = soma + i;
        }
    }

    cout << "\n" << endl;
    cout << "SOMA DOS IMPARES = " << soma << endl;


    return 0;
}
