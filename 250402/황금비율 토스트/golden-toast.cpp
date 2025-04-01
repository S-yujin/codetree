#include <iostream>
#include <list>
#include <string>

using namespace std;

int main() {
    int n, m;
    cin >> n >> m;

    string s;
    cin >> s;

    list<char> l;
    list<char>::iterator it;

    // 초기 문자열을 리스트에 삽입
    for (int i = 0; i < n; i++) {
        l.push_back(s[i]);
    }

    // 커서를 문자열의 끝으로 설정
    it = l.end();

    for (int i = 0; i < m; i++) {
        char a;
        cin >> a;

        if (a == 'L') {
            if (it != l.begin())
                it--;  // 커서를 왼쪽으로 이동
        }
        else if (a == 'R') {
            if (it != l.end())
                it++;  // 커서를 오른쪽으로 이동
        }
        else if (a == 'D') {
            if (it != l.end()) {
                it = l.erase(it);  // 삭제 후 커서는 다음 원소로 자동 이동
            }
        }
        else if (a == 'P') {
            char b;
            cin >> b;
            it = l.insert(it, b);  // 삽입 후 커서가 삽입된 위치를 가리킴
            it++;  // 삽입 후 커서를 오른쪽으로 이동
        }
    }

    // 리스트 출력
    for (char c : l) {
        cout << c;
    }
    
    return 0;
}
