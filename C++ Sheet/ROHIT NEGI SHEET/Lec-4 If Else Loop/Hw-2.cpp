// Take a number in input (ex n) and print the corresponding month to it. Ex: for n=1, print january, n=2, print feburary like this you need to give output. It is given that n will be greater than 0 and less than 13.


#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cout <<"Input any number: ";
    cin >> n;

    if(n > 0 && n < 13)
    {
        if(n == 1) 
            cout << "January";
        if(n == 2) 
            cout << "February";
        if(n == 3) 
            cout << "March";
        if(n == 4) 
            cout << "April";
        if(n == 5) 
            cout << "May";
        if(n == 6) 
            cout << "June";
        if(n == 7) 
            cout << "July";
        if(n == 8) 
            cout << "August";
        if(n == 9) 
            cout << "September";
        if(n == 10) 
            cout << "October";
        if(n == 11) 
            cout << "November";
        if(n == 12) 
            cout << "December";    
    }

    cout << "Invalid input " << endl;


    return 0;
}