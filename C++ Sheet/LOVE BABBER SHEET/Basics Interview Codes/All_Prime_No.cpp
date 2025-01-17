// Print all prime from 1 to n

#include<iostream>
using namespace std;

bool checkPrime(int n)
{
    int i = 2;
    for(i = 2; i < n; i++)
    {
        if(n % i == 0) {
            return false;
        }
    }
    return true;
}

int main()
{
    int n;
    cout << "Enter your number: ";
    cin >> n;

    for(int i = 2; i <= n; i++)
    {
        bool isiPrime = checkPrime(i);
        if(isiPrime) {
            cout<<i<< " ";
        }
    }
    return 0;
}