#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int arr[100000];

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    // 퀵 정렬 구현
    int stack[100000]; // 재귀 대신 스택으로 구현
    int top = -1;

    stack[++top] = 0;      // 왼쪽 인덱스
    stack[++top] = n - 1;  // 오른쪽 인덱스

    while (top >= 0) {
        int right = stack[top--];
        int left = stack[top--];

        if (left >= right) continue;

        int pivot = arr[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            while (i <= right && arr[i] <= pivot) i++;
            while (j > left && arr[j] >= pivot) j--;
            if (i < j) swap(arr[i], arr[j]);
        }
        swap(arr[left], arr[j]); // 피벗 위치 확정

        // 왼쪽, 오른쪽 구간 다시 스택에 push
        stack[++top] = left;
        stack[++top] = j - 1;

        stack[++top] = j + 1;
        stack[++top] = right;
    }

    // 결과 출력
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    return 0;
}
