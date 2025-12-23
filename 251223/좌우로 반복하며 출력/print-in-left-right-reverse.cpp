#include <iostream>
using namespace std;

int main() {
    int arr;
    int n;
    int a = 0;
    cin >> n;
    for (int i=0;i<n; i++){
        for (int j=0; j<n; j++){
            if (i % 2 == 0){
                a += 1;
                cout << a;
            }
            else{
                cout << a;
                a -= 1;
            }
        }
        cout << endl;
    }
    return 0;
}