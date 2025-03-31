#include <iostream>
using namespace std;

int main() {
    int N;
    int arr[3];

    cin >> N;

    for(int i = 0; i < N; i++)
        cin >> arr[i];

    for(int i = 0; i < N; i++)
        cout << arr[i] * arr[i] << " ";

    return 0;
}