#include <iostream>
#include <string>

using namespace std;

class Weather {
public:
    string date;
    string day;
    string condition;

    // 생성자
    Weather(string d = "9999-12-31", string dy = "", string c = "") {
        date = d;
        day = dy;
        condition = c;
    }
};

int main() {
    int n;
    cin >> n;

    Weather latestRainyDay; // 가장 최근 비 오는 날 저장

    for (int i = 0; i < n; i++) {
        string date, day, condition;
        cin >> date >> day >> condition;

        // 비 오는 날 찾고 최신 날짜 갱신
        if (condition == "Rain" && date < latestRainyDay.date) {
            latestRainyDay = Weather(date, day, condition);
        }
    }

    // 가장 최근의 비 오는 날 출력
    cout << latestRainyDay.date << " " << latestRainyDay.day << " " << latestRainyDay.condition << endl;

    return 0;
}
