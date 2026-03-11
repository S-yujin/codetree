#include <iostream>
using namespace std;

int sequence(int N) {
    if (N == 1) return 1;
    if (N == 2) return 2;
    return sequence(N / 3) + sequence(N - 1);
}

int main() {
    int N;
    cin >> N;
    cout << sequence(N) << endl;
    return 0;
}
