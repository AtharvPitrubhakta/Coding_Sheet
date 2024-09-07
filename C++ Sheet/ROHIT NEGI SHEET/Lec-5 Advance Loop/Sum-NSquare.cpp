#include<iostream>
using namespace std;

int main() {

// WAP to sum of first n(square) numbers.

    int n;
    int sum = 0;

    cout << "Enter your number: ";
    cin >> n;

    for(int i = 1; i <= n; i++) {
        sum = sum + i * i;
    }

    cout << sum;

    return 0;
}