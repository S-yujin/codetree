#include <iostream>
#include <deque>
using namespace std;

int main() {
    int N;
    cin >> N;

    deque<int> dq;
    for (int i = 1; i <= N; i++) {
        dq.push_back(i);
    }

    while (dq.size() > 1) {
        dq.pop_front();               // 맨 앞 제거
        dq.push_back(dq.front());     // 그 다음 숫자 뒤로 이동
        dq.pop_front();               // 그 숫자는 앞에서 제거
    }

    cout << dq.front() << '\n';       // 남은 하나 출력
    return 0;
}
