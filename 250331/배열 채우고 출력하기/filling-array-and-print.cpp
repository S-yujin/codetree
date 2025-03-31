#include <iostream>
using namespace std;

int main() {
    char c[10] = {};

    for (int i = 0; i <= 10; i++)
    {
        cin >> c[i];
    }

    for (int i = 0; i <= 9; i++)
    {
        cout << c[9-i];
    }
    return 0;
}