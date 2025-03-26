#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int x, y;
    cin >> x >> y;

    cout << x + y << " " << fixed << setprecision(1) << static_cast<double>(x) / y << endl;

    return 0;
}
