#include<iostream>
using namespace std;

int main() {

// To print the table program for any number.

    int n;
    cout << "Enter your number: ";
    cin >> n;

    for(int i = 1; i <= 10; i++) {
        cout << n << "*" << i << "=" << n * i << endl;
    }

    return 0;

}