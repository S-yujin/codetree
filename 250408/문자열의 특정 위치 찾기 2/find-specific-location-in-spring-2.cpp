#include <iostream>
#include <string>

using namespace std;

int main() {
    string arr[] = {"apple", "banana", "grape", "blueberry", "orange"};
    char c;
    cin >> c;

    int count = 0;
    for (int i = 0; i < 5; i++) {
        if ((arr[i].size() > 2 && arr[i][2] == c) || (arr[i].size() > 3 && arr[i][3] == c)) {
            cout << arr[i] << '\n';
            count++;
        }
    }

    cout << count << '\n';

    return 0;
}
