#include <iostream>
using namespace std;

int count_operations(int n, int count = 0) {
    if (n == 1) return count; 
    if (n % 2 == 0) return count_operations(n / 2, count + 1); 
    return count_operations(n / 3, count + 1); 
}

int main() {
    int N;
    cin >> N; 
    cout << count_operations(N) << endl; 
    return 0;
}
