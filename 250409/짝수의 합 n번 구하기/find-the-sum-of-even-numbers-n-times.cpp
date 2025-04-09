#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;

    for (int i = 0; i < N; i++) {  // 첫 번째 반복문: 테스트 케이스 수만큼 반복
        int a, b;
        cin >> a >> b;

        int sum = 0;
        for (int j = a; j <= b; j++) {  // 두 번째 반복문: a부터 b까지 반복
            if (j % 2 == 0) {
                sum += j;
            }
        }

        cout << sum << endl;
    }

    return 0;
}
