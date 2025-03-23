#include <iostream>

#define MAX_N 5

using namespace std;
struct person
{
    char codename[MAX_N];
    int score[MAX_N];
};

int main() {
    person people;

    for (int i = 0; i < MAX_N; i++) {
        cin >> people.codename[i] >> people.score[i];
    }

    int min_index = 0;

    for(int i = 1; i < MAX_N; i++)
    {
        if (people.score[i] < people.score[min_index])
        {
            min_index = i;
        }
    }

    cout << people.codename[min_index] << " " << people.score[min_index] << endl;

    return 0;
}
