#include <iostream>

using namespace std;

int sumOddEven(int n, int current) {
    if (current > n) 
        return 0; 
    return current + sumOddEven(n, current + 2);
}

int main() {
    int N;
    cin >> N;

    int result = sumOddEven(N, (N % 2 == 1) ? 1 : 2);
    
    cout << result << endl;
    return 0;
}
