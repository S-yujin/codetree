#include <iostream>
using namespace std;

void printPattern(int current) {
    cout << current << " ";  // 현재 숫자 출력

    if (current == 1) {
        cout << current << " ";  // 1을 한 번 더 출력
        return;  // 재귀 종료
    }

    printPattern(current - 1);  // 감소 과정 (재귀 호출)

    cout << current << " ";  // 증가 과정 (재귀 호출 후 다시 출력)
}

int main() {
    int N;
    cin >> N;
    
    printPattern(N);  // 처음 호출 (N부터 시작)
    
    return 0;
}

