#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;

    for (int i = 1; i <= N; i++) {
        int stars = 2 * i - 1;
        for (int j = 0; j < stars; j++) {
            cout << "*";
        }
        cout << endl;
    }

    return 0;
}
