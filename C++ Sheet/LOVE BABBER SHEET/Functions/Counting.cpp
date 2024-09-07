#include<iostream>
using namespace std;

// Function Signature
void printCounting(int n){

    // Function Body
    for(int i = 0; i <= n; i++) {
        cout << i << " ";
    }
    cout << endl;
}

int main() {
    
    int n;
    cin >> n;

    // Function call
    printCounting(n);

    return 0;
}