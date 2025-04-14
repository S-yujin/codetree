#include <iostream>
using namespace std;

int arr[100001];
int n;

int main() {
    cin >> n;
    for (int i = 1; i <= n; i++) {
        cin >> arr[i];
    }

    // 1. 최대 힙 만들기
    for (int i = n / 2; i >= 1; i--) {
        int parent = i;
        while (2 * parent <= n) {
            int child = 2 * parent;
            if (child + 1 <= n && arr[child + 1] > arr[child]) {
                child++;
            }
            if (arr[parent] >= arr[child]) break;
            swap(arr[parent], arr[child]);
            parent = child;
        }
    }

    // 2. 힙 정렬 수행
    for (int i = n; i >= 2; i--) {
        swap(arr[1], arr[i]); // 최대값을 맨 뒤로 보냄
        int parent = 1;
        int heapSize = i - 1;

        while (2 * parent <= heapSize) {
            int child = 2 * parent;
            if (child + 1 <= heapSize && arr[child + 1] > arr[child]) {
                child++;
            }
            if (arr[parent] >= arr[child]) break;
            swap(arr[parent], arr[child]);
            parent = child;
        }
    }

    // 3. 오름차순 출력 (arr[1] ~ arr[n])
    for (int i = 1; i <= n; i++) {
        cout << arr[i] << " ";
    }

    return 0;
}