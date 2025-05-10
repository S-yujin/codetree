#include <iostream>
#include <string>
#include <queue>

using namespace std;

int N;
string command[10000];
int A[10000];

int main() {
    cin >> N;

    for (int i = 0; i < N; i++) {
        cin >> command[i];
        if (command[i] == "push") {
            cin >> A[i];
        }
    }

    queue<int> q;

    for (int i = 0; i < N; i++) {
        if (command[i] == "push") {
            q.push(A[i]);
        }
        else if (command[i] == "pop") {
            if (!q.empty()) {
                cout << q.front() << "\n";
                q.pop();
            } else {
                cout << -1 << "\n";
            }
        }
        else if (command[i] == "size") {
            cout << q.size() << "\n";
        }
        else if (command[i] == "empty") {
            cout << (q.empty() ? 1 : 0) << "\n";
        }
        else if (command[i] == "front") {
            if (!q.empty()) {
                cout << q.front() << "\n";
            } else {
                cout << -1 << "\n";
            }
        }
    }

    return 0;
}
