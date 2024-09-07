#include<iostream>
using namespace std;

int main() {

// WAP to print pow of any number;

    int n,pow,num;
    cout << "Enter your number: ";
    cin >> n;
    cout << "Enter your power: ";
    cin >> pow;

    num = n;
    for(int i = 1; i < pow; i++) {
        num = num * n;
    }

    cout << num;

    return 0;
}