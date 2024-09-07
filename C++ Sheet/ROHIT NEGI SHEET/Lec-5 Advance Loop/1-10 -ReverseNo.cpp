#include<iostream>
using namespace std;

int main() {


// To print reverse ex: 10 to 1 numbers.

    int n;
    cout << "Enter your number: ";
    cin >> n;

    for(int i = n; i >= 1; i = i - 1) {
        cout << i << " ";
    }

    return 0;
}