#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;

    if(N % 2 == 0 && N % 5 ==0)
        cout << "true" << endl;
    else if (N % 2 == 1 && N % 3 == 0)
        cout << "true" << endl;
    else
        cout << "false" << endl;
        
    return 0;
}