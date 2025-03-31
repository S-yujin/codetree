#include <iostream>
using namespace std;

int main() {
    int gender, age;
    cin >> gender;
    cin >> age;

    if(gender == 0)
    {
        if(age >= 20)
            cout << "MAN" << endl;
        else
            cout <<"BOY" << endl;
    }
    else
        if (age >= 20)
            cout << "WOMAN" << endl;
        else
            cout << "GIRL" << endl;
            
    return 0;
}