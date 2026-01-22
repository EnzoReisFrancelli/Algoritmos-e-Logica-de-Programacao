#include <bits/stdc++.h>

using namespace std;

int main(){

    double base, altura, area, perimetro, diagonal;

    cout << "Digite a base do retangulo: ";
    cin >> base;
    cout << "Digite a altura do retagulo: ";
    cin >> altura;

    area = base * altura;
    perimetro = 2 * (base + altura);
    diagonal = sqrt(pow(base,2) * pow(altura,2));

    cout << fixed << setprecision(4);
    cout << "BASE = " << base << endl;
    cout << "ALTURA = " << altura << endl;
    cout << "AREA = " << area << endl;
    cout << "PERIMETRO = " << perimetro << endl;
    cout << "DIAGONAL = " << diagonal << endl;


    return 0;
}
