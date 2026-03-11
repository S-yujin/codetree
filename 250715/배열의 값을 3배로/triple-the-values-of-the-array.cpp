#include <iostream>
using namespace std;

int main() {
    int x [3][3];

    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
            cin >> x[i][j];
            cout << 3 * x[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}