// #include<iostream>
// using namespace std;


// unsigned long long int Fact(int n) {
//     unsigned long long int fact = 1;

//     for(int i = 1; i <= n; i++)
//     {
//         // fact = fact * i;
//         fact *= i;
//     }

//     return fact;
// }

// int main()
// {
//     unsigned long long int n;
//     cout << "Enter Your Number: ";
//     cin >> n;

//     unsigned long long int ans = Fact(n);
//     cout << "Factorial of " << n << " is: " << ans << endl;

//     return 0;
// }


#include<iostream>
using namespace std;

int fact(int n) {
    
    int fact = 1;
    for(int i = 1; i <= n; i++)
    {
        fact = fact * i;
    }

    return fact;
}

int main()
{   
    int n;
    cout << "Enter your number: ";
    cin >> n;

    int ans = fact(n);
    cout << "The Factorial of " << n << " is: " << ans << endl;

    return 0;
}