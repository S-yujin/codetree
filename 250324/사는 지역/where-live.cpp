#include <iostream>
#include <string>

#define MAX_N 10

using namespace std;

class Person {
public:
    string name;
    string street_address;
    string region;

    // 생성자
    Person() {}
    Person(string n, string addr, string reg) {
        name = n;
        street_address = addr;
        region = reg;
    }
};

int main() {
    int n;
    cin >> n;

    Person people[MAX_N];

    for (int i = 0; i < n; i++) {
        string name, street_address, region;
        cin >> name >> street_address >> region;
        people[i] = Person(name, street_address, region);
    }

    // 사전순으로 가장 늦은 이름을 가진 사람 찾기
    Person last_person = people[0];
    for (int i = 1; i < n; i++) {
        if (people[i].name > last_person.name) {
            last_person = people[i];
        }
    }

    // 형식에 맞게 출력
    cout << "name " << last_person.name << endl;
    cout << "addr " << last_person.street_address << endl;
    cout << "city " << last_person.region << endl;

    return 0;
}
