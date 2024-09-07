#include<iostream>
using namespace std;

int main() {

// WAP to print the number of Factorial.

    unsigned long long int n , fact = 1 , i;
    cout << "Enter your number: ";
    cin >> n;

    for(i = 1; i <= n; i++) {
        fact = fact * i;
    }

    cout << fact;

}


