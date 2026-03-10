#include <iostream>
using namespace std;

int N;
string command[10000];
int value[10000];

int stack[10000];
int top_idx = -1;

int main() {
    cin >> N;

    for (int i = 0; i < N; i++) {
        cin >> command[i];
        if (command[i] == "push") {
            cin >> value[i];
        }
    }

    for (int i = 0; i < N; i++) {
        if (command[i] == "push") {
            stack[++top_idx] = value[i];
        } else if (command[i] == "pop") {
            if (top_idx == -1) cout << -1 << '\n';
            else cout << stack[top_idx--] << '\n';
        } else if (command[i] == "size") {
            cout << (top_idx + 1) << '\n';
        } else if (command[i] == "empty") {
            cout << (top_idx == -1 ? 1 : 0) << '\n';
        } else if (command[i] == "top") {
            if (top_idx == -1) cout << -1 << '\n';
            else cout << stack[top_idx] << '\n';
        }
    }

    return 0;
}
