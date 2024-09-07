#include<iostream>
using namespace std;

int main() 
{


// WAP to check number is prime or not.

    int n;
    cout << "Enter the number: ";
    cin >> n;

    if(n < 2) {
        cout << "Not a prime number";
        return 0;
    }
    else{
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                cout << "Not a prime number";
                return 0; 
            }
        }
        cout << "This is a prime number";
        return 0;
    }

}