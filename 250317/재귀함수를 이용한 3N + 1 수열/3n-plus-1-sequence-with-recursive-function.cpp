#include <iostream>
using namespace std;

int countSteps(int n) {
    if (n == 1) return 0; 
    if (n % 2 == 0) return 1 + countSteps(n / 2); 
    else return 1 + countSteps(n * 3 + 1); 
}

int main() {
    int N;
    cin >> N;
    cout << countSteps(N) << endl;
    return 0;
}
