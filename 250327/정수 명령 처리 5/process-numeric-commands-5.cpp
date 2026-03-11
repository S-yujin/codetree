#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
    int N;
    cin >> N;

    vector<int> vec;

    while (N--) {
        string command;
        cin >> command;

        if (command == "push_back") {
            int num;
            cin >> num;
            vec.push_back(num);
        }
        else if (command == "pop_back") {
            if (!vec.empty()) {
                vec.pop_back();
            }
        }
        else if (command == "size") {
            cout << vec.size() << endl;
        }
        else if (command == "get") {
            int k;
            cin >> k;
            if (k >= 1 && k <= vec.size()) {
                cout << vec[k - 1] << endl;
            }
        }
    }

    return 0;
}
