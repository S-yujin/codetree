#include <iostream>
using namespace std;

int main() {
    int A, B;
    cin >> A >> B;
    
    for (int i = B; i >= A; i--) {
        cout << i;
        if (i > A) cout << " ";
    }
    
    return 0;
}