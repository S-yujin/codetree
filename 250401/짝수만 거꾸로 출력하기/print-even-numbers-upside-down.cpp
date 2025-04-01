#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;

    int arr[N]; // 입력받을 배열

    for (int i = 0; i < N; i++) {
        cin >> arr[i]; // N개의 정수 입력
    }

    // 역순으로 탐색하며 짝수 출력
    for (int j = N - 1; j >= 0; j--) {
        if (arr[j] % 2 == 0) {
            cout << arr[j];
            if (j > 0) cout << " "; // 마지막 숫자 뒤에는 공백 없음
        }
    }

    return 0;
}
