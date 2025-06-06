#include <iostream>
#include <string>
#include <deque>
using namespace std;

int main() {
    int N;
    cin >> N;
    string cmd;
    deque<int> dq;

    for (int i = 0; i < N; i++) {
        cin >> cmd;
        if (cmd == "push_front") {
            int x;
            cin >> x;
            dq.push_front(x);
        } else if (cmd == "push_back") {
            int x;
            cin >> x;
            dq.push_back(x);
        } else if (cmd == "pop_front") {
            if (!dq.empty()) {
                cout << dq.front() << '\n';
                dq.pop_front();
            } else {
                cout << -1 << '\n';
            }
        } else if (cmd == "pop_back") {
            if (!dq.empty()) {
                cout << dq.back() << '\n';
                dq.pop_back();
            } else {
                cout << -1 << '\n';
            }
        } else if (cmd == "size") {
            cout << dq.size() << '\n';
        } else if (cmd == "empty") {
            cout << (dq.empty() ? 1 : 0) << '\n';
        } else if (cmd == "front") {
            if (!dq.empty()) {
                cout << dq.front() << '\n';
            } else {
                cout << -1 << '\n';
            }
        } else if (cmd == "back") {
            if (!dq.empty()) {
                cout << dq.back() << '\n';
            } else {
                cout << -1 << '\n';
            }
        }
    }

    return 0;
}
