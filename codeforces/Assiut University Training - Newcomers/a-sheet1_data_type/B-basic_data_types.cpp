#include <iostream>
#include <iomanip> 
using namespace std;

int main()
{
    int i;
    long long lld;
    char ch;
    float f;
    double d;

    cin >> i >> lld >> ch >> f >> d;

    cout << i << endl;
    cout << lld << endl;
    cout << ch << endl;
    cout <<fixed<<setprecision(2)<< f << endl;
    cout <<fixed<<setprecision(1)<< d << endl;
    return 0;
}
