#include<iostream>
using namespace std;

int main() 
{

// / WAP to print the Fibonacci Series.


    int n;
    cout << "Enter the number:";
    cin >> n;

    int last = 0, prev = 1,  curr = 1;

    if(n == 1) {
        cout << last;
        return 0;
    }

    for(int i = 3; i <= n; i++) {
        curr = prev + last;
        last = prev;
        prev = curr;
    }

    cout << curr;
}