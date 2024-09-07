#include<iostream>
using namespace std;

int main() {


// WAP to sum of n natural numbers.

    int n;
    int sum = 0;

    cout << "Enter your number: ";
    cin >> n;

    // Pattern 1

    // for(int i = 1; i <= n; i++) {
    //     sum = sum + i;
    //     cout << sum << endl;
    // }

    


    // Pattern 2

    cout << (n * (n+1) ) / 2;


    return 0;

}