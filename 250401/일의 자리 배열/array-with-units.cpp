#include <iostream>

using namespace std;

int main() {
    int num[10];

    cin >> num[0] >> num [1];

    for(int i = 2; i < 10; i++)
        num[i] =(num[i - 2] + num[i - 1]) % 10;

    for(int i = 0; i < 10; i++)
    {
        cout << num[i];
        if(i != 9)
            cout << " ";
    }

    return 0;
}