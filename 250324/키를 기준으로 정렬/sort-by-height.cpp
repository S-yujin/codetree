#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Person
{
public: 
    string name;
    int height;
    int weight;

    Person(string n, int h, int w)
    {
        this -> name = n;
        this -> height = h;
        this -> weight = w;
    }
};

bool compare(Person a, Person b)
{
    return a.height < b.height; //키 오름차순
}


int main() {
    int n;
    cin >> n;

    vector<Person> people;

    for (int i = 0; i < n; i++) {
        string name;
        int height, weight;

        cin >> name >> height >> weight;
        people.push_back(Person(name, height,weight));
    }

    sort(people.begin(), people.end(), compare);

    for(const auto &p : people)
    {
        cout << p.name << " " << p.height << " " << p.weight << endl;
    }

    return 0;
}