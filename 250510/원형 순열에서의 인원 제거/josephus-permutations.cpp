#include <iostream>
#include <list>

using namespace std;

int main() {
    int N, K;
    cin >> N >> K;

    list<int> circle;
    for (int i = 1; i <= N; ++i)
        circle.push_back(i);

    auto it = circle.begin();

    while (!circle.empty()) {
        // K-1번 이동
        for (int i = 1; i < K; ++i) {
            ++it;
            if (it == circle.end()) it = circle.begin();
        }

        // 현재 위치 출력 및 제거
        cout << *it;
        it = circle.erase(it);
        if (it == circle.end()) it = circle.begin();

        if (!circle.empty()) cout << " ";
    }

    return 0;
}
