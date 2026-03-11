#include <iostream>
using namespace std;

int main() {
    int start, end;
    cin >> start >> end;
    int count = 0;

    for (int num = start; num <= end; num++) {  // 첫 번째 반복문
        int divisors = 0;
        for (int i = 1; i <= num; i++) {  // 두 번째 반복문
            if (num % i == 0) {
                divisors++;
            }
        }
        if (divisors == 3) {
            count++;
        }
    }

    cout << count << endl;
    return 0;
}
