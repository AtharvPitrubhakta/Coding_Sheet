#include<iostream>
using namespace std;

bool checkEven(int n) {
    if(/*n % 2 == 0*/ (n & 1) == 0){
        return true;
    }
    else {
        return false;
    }
}

int main()
{
    int n;
    cin >> n;

    bool isEven = checkEven(n);
    // cout << "The Nummber " << n << " is: " << isEven << endl;

    if(isEven) {
        cout << n << " is Even Number.\n";
    }
    else {
        cout << n << " is Odd Number.\n";
    }

    return 0;
}




// unsigned int Even_Odd(int n) {

//     if(n % 2 == 0){
//         cout << "Number is Even" << endl;
//     }
//     else {
//         cout << "Number is Odd" << endl;
//     }

//     return n;
// }


// int main()
// {
//     unsigned int n;
//     cout << "Enter your number: ";
//     cin >> n;

//     unsigned int ans = Even_Odd(n);

//     return 0;
// }