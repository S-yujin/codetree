#include <iostream>
#include <list>
#include <string>

using namespace std;

int main()
{
    int N;
    cin >> N;

    list<int> lst;

    while(N--)
    {
        string command;
        cin >> command;

        if(command == "push_front")
        {
            int num_pushF;
            cin >> num_pushF;
            lst.push_front(num_pushF);
        }
        else if(command == "push_back")
        {
            int num_pushB;
            cin >> num_pushB;
            lst.push_back(num_pushB);
        }
        else if(command == "pop_front")
        {
            cout << lst.front() << endl;
            if(!lst.empty())
                lst.pop_front();
        }
        else if(command == "pop_back")
        {
            cout << lst.back() << endl;
            if (!lst.empty())
                lst.pop_back();
        }
        else if(command == "size")
            cout << lst.size() << endl;
        else if(command == "empty")
            cout << (lst.empty() ? "1\n" : "0\n");
        else if(command == "front")
        {
            if (!lst.empty())
                cout << lst.front() << endl;
        }
        else if (command == "back")
        {
            if(!lst.empty())
                cout << lst.back() << endl;
        }
    }

    return 0;
}