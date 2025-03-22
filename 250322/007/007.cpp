#include <iostream>
#include <string>

using namespace std;
struct SecretInfo {
    string secret_code;
    char meeting_point;
    int time;
};

int main() {
    SecretInfo info;
    
    cin >> info.secret_code >> info.meeting_point >> info.time;

    cout << "secret code : " << info.secret_code << endl;
    cout << "meeting point : " << info.meeting_point << endl;
    cout << "time : " << info.time << endl;

    return 0;
}