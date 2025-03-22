#include <iostream>
#include <algorithm>

using namespace std;

int N;
int nums[2000];

int main() {
    cin >> N;

    for (int i = 0; i < 2 * N; i++) {
        cin >> nums[i];
    }

    sort(nums, nums + 2 * N);

    int max_sum = 0;

    for(int i = 0; i < N; i++)
    {
        int sum = nums[i] + nums[2 * N - 1 - i];
        max_sum = max(max_sum, sum);
    }

    cout << max_sum << endl;

    return 0;
}
