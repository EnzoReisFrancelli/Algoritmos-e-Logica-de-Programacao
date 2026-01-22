#include <bits/stdc++.h>

using namespace std;

int main(){

    int v1, v2, v3;

    cout << "Digite o primeiro valor: ";
    cin >> v1;
    cout << "Digite o segundo valor: ";
    cin >> v2;
    cout << "Digite o terceiro valor: ";
    cin >> v3;
    cout << "\n" << endl;
    if(v1 <= v2 && v1 <= v3){
        cout << "O menor valor eh " << v1 << endl;
    }else if(v2 <= v1 && v2 <= v3){
        cout << "O menor valor eh " << v2 << endl;
    }else if(v3 <= v1 && v3 <= v3){
        cout << "O menor valor eh " << v3 << endl;
    }else{
        cout << "teste impossivel!" << endl;
    }


    return 0;
}
