#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cin >> str;

    str[1] = 'a';
    str[str.length() - 2] = 'a';

    cout << str << endl;
    return 0;
}