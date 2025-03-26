#include <iostream>
using namespace std;

int main() {
    int x, y;

    cin >> x >> y;

    cout <<fixed;
    cout.precision(1);
    cout<< x + y << " " << (double(x) + double(y)) / 2 << endl;

    return 0;
}