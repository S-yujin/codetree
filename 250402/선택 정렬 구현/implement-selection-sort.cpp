#include <iostream>

using namespace std;

int main() {
    int n;
    int arr[100];  // 정적 배열 선언

    cin >> n;

    // 배열 입력 받기
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    // 선택 정렬 (Selection Sort)
    for (int i = 0; i < n - 1; i++) {
        int minIdx = i;  // 최소값의 인덱스
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }
        // 최솟값을 찾은 후 한 번만 교환
        swap(arr[i], arr[minIdx]);
    }

    // 정렬된 배열 출력
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    return 0;
}
