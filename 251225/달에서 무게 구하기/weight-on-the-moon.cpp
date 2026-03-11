#include <iostream>
using namespace std;

int main() {
    cout << fixed;
    
    int w = 13;
    float g = 0.165;
    
    cout.precision(6);
    cout << w << " * " << g << " = " << w * g;
    return 0;
}