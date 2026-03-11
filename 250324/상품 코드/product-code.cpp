#include <iostream>
#include <string>

using namespace std;

class Product{
public:
    string product_name;
    int product_code;

    Product() {}

    Product(string name, int code)
    {
        product_name = name;
        product_code = code;
    }

    void print()
    {
        cout << "product " << product_code << " is " << product_name << endl;
    }
};

int main() {
    Product product1("codetree", 50);
    
    string name;
    int code;
    cin >> name >> code;
    Product product2(name, code);

    product1.print();
    product2.print();

    return 0;
}