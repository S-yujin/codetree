#include <iostream>
#include <string>

using namespace std;

// 구조체 정의
struct User {
    string id;
    int level;
};

int main() {
    User user1 = {"codetree", 10};

    User user2;
    cin >> user2.id >> user2.level;

    cout << "user " << user1.id << " lv " << user1.level << endl;
    cout << "user " << user2.id << " lv " << user2.level << endl;

    return 0;
}
