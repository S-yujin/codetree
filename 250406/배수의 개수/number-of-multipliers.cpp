#include <iostream>
using namespace std;

int main() {
    int a;
    int sum_3 = 0, sum_5 = 0;

    for (int i = 0; i < 10; i++) {
        cin >> a;
        if (a % 3 == 0)
            sum_3 += 1;
        if (a % 5 == 0)
            sum_5 += 1;
    }

    cout << sum_3 << " " << sum_5 << endl;
    return 0;
}
