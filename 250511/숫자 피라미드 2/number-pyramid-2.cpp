#include <iostream>
using namespace std;

int main() {
    int num = 1; // 출력할 숫자
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++) { // 총 4줄
        for (int j = 1; j <= i; j++) {
            cout << num << " ";
            num++;
        }
        cout << endl;
    }
    return 0;
}
