#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> arr(n);

    // 입력 받기
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }

    // 병합 정렬 구현 (반복적으로 분할 후 병합)
    vector<int> temp(n);  // 병합 결과를 담을 임시 배열

    // size: 현재 병합할 부분 배열의 크기 (1, 2, 4, 8, ...)
    for (int size = 1; size < n; size *= 2) {
        for (int left = 0; left < n; left += 2 * size) {
            int mid = min(left + size - 1, n - 1);
            int right = min(left + 2 * size - 1, n - 1);

            int i = left;
            int j = mid + 1;
            int k = left;

            // 병합: 두 부분 배열을 비교하면서 temp에 삽입
            while (i <= mid && j <= right) {
                if (arr[i] <= arr[j])
                    temp[k++] = arr[i++];
                else
                    temp[k++] = arr[j++];
            }

            // 남은 값들 처리
            while (i <= mid)
                temp[k++] = arr[i++];
            while (j <= right)
                temp[k++] = arr[j++];
        }

        // temp 배열을 arr로 복사
        for (int i = 0; i < n; ++i) {
            arr[i] = temp[i];
        }
    }

    // 결과 출력
    for (int i = 0; i < n; ++i) {
        cout << arr[i];
        if (i < n - 1) cout << " ";
    }

    cout << endl;

    return 0;
}
