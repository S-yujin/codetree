#include <iostream>
#include <vector>
using namespace std;

int gcd(int a, int b) {
    return b ? gcd(b, a % b) : a;
}

int lcm(int a, int b) {
    return (a / gcd(a, b)) * b;
}

int findLCM(vector<int>& arr, int n) {
    if (n == 1) return arr[0];
    return lcm(arr[n - 1], findLCM(arr, n - 1));
}

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << findLCM(arr, n) << endl;
    return 0;
}
