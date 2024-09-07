#include<bits/stdc++.h>
using namespace std;

bool leapYear(int n) 
{
    if(n % 400 == 0)
        return true;
    else if(n % 4 == 0 && n % 100 != 0)
        return true;
    else
        return false;

    cout << endl;
}

int main()
{
    int n;
    cout <<"Input the year: ";
    cin >> n;

    cout << leapYear(n) << endl;
}


// bool LeapYear(int year)
// {
//     if(year % 400 == 0)
//         return 1;
//     else if(year % 4 == 0 && year % 100 != 0)
//         return 1;
//     else
//         return 0;
//     cout<<endl;
// };

// int main()
// {
//     int year;
//     cout << "Enter the input: ";
//     cin >> year;

//     cout << LeapYear(year) << endl;
// }