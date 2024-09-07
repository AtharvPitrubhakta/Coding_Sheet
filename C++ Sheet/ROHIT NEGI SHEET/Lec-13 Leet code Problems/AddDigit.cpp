#include<iostream>
using namespace std;

int addDigit(int num) {

    while(num > 9) {
        int ans = 0, rem;

        while(num != 0)
        {
            rem = num % 10;
            num /= 10;
            ans += rem;
        }
        num = ans;
    }
    return num;
}


int main()
{
    int num;
    cout << "Input any number: ";
    cin >> num;

    cout << addDigit(num);
}