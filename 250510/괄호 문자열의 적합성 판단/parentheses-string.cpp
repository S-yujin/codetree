#include <iostream>
#include <string>
using namespace std;

string str;

int main() {
    cin >> str;

    int cnt = 0;  // 열린 괄호 '(' 수를 카운트

    for (char c : str) {
        if (c == '(') cnt++;
        else cnt--;

        // 닫는 괄호가 더 많은 경우 → 잘못된 문자열
        if (cnt < 0) {
            cout << "No" << endl;
            return 0;
        }
    }

    // 모든 괄호가 짝지어졌는지 확인
    if (cnt == 0) cout << "Yes" << endl;
    else cout << "No" << endl;

    return 0;
}
