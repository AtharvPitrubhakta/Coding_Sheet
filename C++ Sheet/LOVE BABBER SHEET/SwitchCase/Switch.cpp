#include<iostream>
using namespace std;

int main(){

    // int num = 2;
    char ch = 'a';

    cout << endl;

    switch ( ch )
    {
    case 1: cout << " First " << endl;
            break;
    
    case '2': cout << " Charcter Second " << endl;
            break;

    default: cout << " It is Default Case " << endl;
            break;
    }

    cout << endl;
}