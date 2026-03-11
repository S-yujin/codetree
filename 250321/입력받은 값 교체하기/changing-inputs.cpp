#include <iostream>
using namespace std;

int main() {
    int a, b, sum;
    cin >> a >> b;

    sum = a;
    a = b;
    b = sum;

    cout << a << "\t" << b;
    
    return 0;
}