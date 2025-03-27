#include <iostream>
#include <list>
#include <string>

using namespace std;

int main() 
{
    int n, m;
    cin >> n >> m;

    list<char> l;
    list<char> :: iterator it;

    for (int i = 0; i < n; i++)
    {
        char t;
        cin >> t;
        l.push_back(t);
    }
    
    it = l.end();

    for (int i = 0; i < m; i++) {
        string command;
        cin >> command;
        
        if (command == "L")
        {
            if(it != l.begin()) 
                it--;
        }

        else if (command == "R")
        {
            if (it != l.end())
                it++;
        }

        else if(command == "D")
        {
            if (it != l.end())
                it = l.erase(it);
        }

        else if (command == "P")
        {
            char c;
            cin >> c;
            it = l.insert(it, c);
        }
    }

    for (it = l.begin(); it != l.end(); it++)
        cout << *it;

    return 0;
}
