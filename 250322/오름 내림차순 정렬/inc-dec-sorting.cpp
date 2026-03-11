#include <iostream>
#include <algorithm>

using namespace std;

int n;
int nums[100];

int main() {
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    // 오름차순 정렬 후 출력
    sort(nums, nums + n);
    for (int i = 0; i < n; i++) {
        cout << nums[i] << (i == n - 1 ? "\n" : " ");
    }

    // 내림차순 정렬 후 출력
    sort(nums, nums + n, greater<int>());
    for (int i = 0; i < n; i++) {
        cout << nums[i] << (i == n - 1 ? "\n" : " ");
    }

    return 0;
}
