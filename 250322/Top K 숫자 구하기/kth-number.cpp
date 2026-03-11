#include <iostream>
#include <algorithm>

using namespace std;

int N, k;
int nums[1000];

int main() {
    cin >> N >> k;

    vector<int> nums(N);

    for (int i = 0; i < N; i++) {
        cin >> nums[i];
    }

    sort(nums.begin(), nums.end());

    cout << nums[k - 1] << endl;

    return 0;
}
