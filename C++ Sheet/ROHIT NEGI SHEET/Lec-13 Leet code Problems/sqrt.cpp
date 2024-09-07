#include<bits/stdc++.h>
using namespace std;

// int sqrt(int x) {

//     if(x == 0 || x == 1) 
//         return x;

//     int i = 1, result = 1;
//     for(i = 1; i <= x; i++) {
//         result = i * i;
//     }
//     return i - 1;

// }



int mySqrt(int x)
{
    long long int i = 0;
    
    while(i * i <= x) {
        i++;
    }
    return i - 1;
}


int main() {
    int x;
    cout <<"Input any number: ";
    cin >> x;
    cout << mySqrt(x) << endl;
    
    return 0;
}


