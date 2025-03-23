#include <iostream>
#include <string>

using namespace std;

struct Bomb {
    string unlock_code;
    char wire_color;
    int seconds;
};

int main() {
    Bomb boom;

    cin >> boom.unlock_code >> boom.wire_color >> boom.seconds;

    cout << "code : " << boom.unlock_code << endl;
    cout << "color : " << boom.wire_color << endl;
    cout << "second : " << boom.seconds << endl;

    return 0;
}