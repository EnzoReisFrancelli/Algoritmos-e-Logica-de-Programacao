#include <bits/stdc++.h>

using namespace std;

int main(){

    int x, y , troca;

    cout << "Digite dois numeros: " << endl;
    cin >> x;
    cin >> y;
    cout << "\n" << endl;
    if(x < y){
        troca = x;
        x = y;
        y = troca;
        cout << "CRESCENTE!" << endl;
    }else{
        cout << "DECRESCENTE!" << endl;
    }



    return 0;
}
