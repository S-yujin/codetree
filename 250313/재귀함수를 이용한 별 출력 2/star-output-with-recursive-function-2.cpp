#include <iostream>
using namespace std;

// 줄의 개수와 현재 출력할 개수를 매개변수로 받음
void printStars(int stars) {
    if (stars == 0) return;  // 기저 조건: 더 이상 출력할 별이 없으면 종료

    // 현재 줄 출력
    for (int i = 0; i < stars; i++) {
        cout << "* ";
    }
    cout << endl;

    // 재귀 호출 (줄어드는 패턴)
    printStars(stars - 1);

    // 다시 증가하는 패턴
    for (int i = 0; i < stars; i++) {
        cout << "* ";
    }
    cout << endl;
}

int main() {
    int N;
    cin >> N;

    printStars(N);  // 재귀 함수 호출

    return 0;
}
