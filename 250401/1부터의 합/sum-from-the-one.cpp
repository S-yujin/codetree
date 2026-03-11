#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;

    int sum = 0; // 합계

    for (int num = 1;num <= 100 ; num++) { // 무한 루프 대신 조건 없는 for문 사용
        sum += num; // 현재 숫자를 합계에 추가
        
        if (sum >= N) { // 합이 N 이상이 되면 종료
            cout << num;
            break;
        }
    }

    return 0;
}
