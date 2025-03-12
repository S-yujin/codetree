#include <iostream>

using namespace std;

int N;

int main() {
    cin >> N;

    for ( int i = 1; i <= N; ++i)
    {
        cout << i << " ";
    }
    cout << endl;
    for (int i = N; i > 0; --i)
    {
        cout << i << " ";
    }

    return 0;
}