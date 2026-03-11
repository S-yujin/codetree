#include <iostream>

using namespace std;

int n;
int arr[100];

int main() {
    cin >> n;
    
    string sorted = "true";

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    do
    {
        sorted = "true";
        for (int i = 0; i < n - 1; i++)
        {
            if(arr[i] > arr[i + 1])
            {
                int temp;
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                sorted = "false";
            }
        }
    }while(sorted == "false");

    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";

    return 0;
}
