#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Student {
public:
    string name;
    int korean, english, math;

    Student(string n, int k, int e, int m) {
        name = n;
        korean = k;
        english = e;
        math = m;
    }
};

bool compare(Student a, Student b) {
    if (a.korean != b.korean) return a.korean > b.korean; // 국어 점수 높은 순
    if (a.english != b.english) return a.english > b.english; // 영어 점수 낮은 순
    if (a.math != b.math) return a.math > b.math; // 수학 점수 높은 순
    return a.name < b.name; // 이름이 사전순으로 앞서는 순
}

int main() {
    int n;
    cin >> n;
    
    vector<Student> students;

    for (int i = 0; i < n; i++) {
        string name;
        int korean, english, math;
        cin >> name >> korean >> english >> math;
        students.push_back(Student(name, korean, english, math));
    }

    // 정렬 수행
    sort(students.begin(), students.end(), compare);

    // 출력
    for (const auto &s : students) {
        cout << s.name << " " << s.korean << " " << s.english << " " << s.math << endl;
    }

    return 0;
}
