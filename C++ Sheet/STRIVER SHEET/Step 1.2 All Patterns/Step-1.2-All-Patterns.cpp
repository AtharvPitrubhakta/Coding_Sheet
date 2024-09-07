#include <bits/stdc++.h>
using namespace std;

// ****Pattern 1****
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// void print1(int n) {
//     for(int i = 0; i < n; i++) {
//         for(int j = 0; j < n; j++) {
//             cout << "* ";
//         }
//         cout << endl;
//     }
// }

// ****Pattern 2****
// *
// * *
// * * *
// * * * *
// * * * * *
// void print2(int n) {
//     for(int i = 0; i < n; i++) {
//         for ( int j = 0; j <= i; j++) {
//             cout << "* ";
//         }
//         cout << endl;
//     }
// }

// ****Pattern 3****
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// void print3(int n) {
//     for(int i = 1; i <= n; i++) {
//         for(int j = 1; j <= i; j++) {
//             cout << j << " ";
//         }
//         cout << endl;
//     }
// }

// ****Pattern 4****
// void print4(int n) {
//     for(int i = 1; i <= n; i++) {
//         for(int j = 1; j <= i; j++) {
//             cout << i << " ";
//         }
//         cout << endl;
//     }
// }

// ****Pattern 5****
// void print5(int n) {
//     for(int i = 1; i <= n; i++) {
//         for(int j = 0; j < n-i+1; j++) {
//             cout << "* ";
//         }
//         cout << endl;
//     }
// }

// ****Pattern 6****
// void print6(int n) {
//     for(int i = 1; i <= n; i++) {
//         for(int j = 1; j <= n-i+1; j++) {
//             cout << j <<" ";
//         }
//         cout << endl;
//     }
// }

// ****Pattern 7****
// void print7(int n) {
//     for(int i = 0 ; i < n; i++) {
//         // space
//         for(int j = 0; j < n-i-1; j++) {
//             cout << " ";
//         }
//         // stars
//         for(int j = 0; j < 2*i+1; j++) {
//             cout << "*";
//         }
//         // space
//         for(int j = 0; j < n-i-1; j++) {
//             cout << " ";
//         }
//         cout << endl;
//     }
// }

// ****Pattern8****
// void print8(int n){
//     for(int i = 0; i < n; i++) {
//         // space
//         for(int j = 0; j < i; j++) {
//             cout << " ";
//         }
//         // stars
//         for(int j = 0; j < 2 * n - (2 * i + 1); j++) {
//             cout << "*";
//         }
//         // space
//         for(int j = 0; j < i; j++) {
//             cout << " ";
//         }
//         cout << endl;
//     }
// }

// ****Pattern-9****
// void print9(int n)
// {
//     for (int i = 0; i < n; i++)
//     {
//         // space
//         for (int j = 0; j < n - i - 1; j++)
//         {
//             cout << " ";
//         }
//         // stars
//         for (int j = 0; j < 2 * i + 1; j++)
//         {
//             cout << "*";
//         }
//         // space
//         for (int j = 0; j < n - i - 1; j++)
//         {
//             cout << " ";
//         }
//         cout << endl;
//     }
//     for (int i = 0; i < n; i++)
//     {
//         // space
//         for (int j = 0; j < i; j++)
//         {
//             cout << " ";
//         }
//         // stars
//         for (int j = 0; j < 2 * n - (2 * i + 1); j++)
//         {
//             cout << "*";
//         }
//         // space
//         for (int j = 0; j < i; j++)
//         {
//             cout << " ";
//         }
//         cout << endl;
//     }
// }

// ****Pattern-10****
// void print10(int n) {
//     for(int i = 1; i <= 2 * n - 1; i++) {
//         int stars = i;
//         if(i > n) stars = 2 * n - i;
//         for ( int j = 1     ; j <= stars; j++) {
//             cout << "* ";
//         }
//         cout << endl;
//     }
// }

// ****Pattern-11*****
// void print11(int n)
// {
//     int start = 1;
//     for (int i = 0; i < n; i++)
//     {
//         if (i % 2 == 0)
//         {
//             start = 1;
//         }
//         else
//         {
//             start = 0;
//         }
//         for (int j = 0; j <= i; j++)
//         {
//             cout << start;
//             start = 1 - start;
//         }
//         cout << endl;
//     }
// }

// ****Pattern-12*****
// void print12(int n){
//     int space = 2 * (n - 1);
//     for(int i = 1; i <= n; i++) {
//         //numbers
//         for(int j = 1; j <= i; j++) {
//             cout << j;
//         }
//         // spaces
//         for(int j = 1; j <= space; j++) {
//             cout << " ";
//         }
//         //numbers
//         for(int j = i; j >= 1; j--) {
//             cout << j;
//         }
//         cout << endl;
//         space -= 2;
//     }
// }

// ****Pattern-13*****
// void print13(int n) {
//     int num = 1;
//     for (int i = 1; i <= n; i++) {
//         for(int j = 0; j <= i; j++) {
//             cout << num << " ";
//             num = num + 1;
//         }
//         cout << endl;
//     }
// }

//  ****Pattern-14*****
// void print14(int n) {
//     for (int i = 0; i < n; i++) {
//         for (char ch = 'A'; ch <= 'A'+ i; ch++) {
//             cout << ch << " ";
//         }
//         cout << endl;
//     }
// }

//  ****Pattern-15*****
// void print15(int n) {
//     for(int i = 0; i < n; i++) {
//         for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
//             cout << ch << " ";
//         }
//         cout << endl;
//     }
// }

//  ****Pattern-16*****
// void print16(int n) {
//     for (int i = 0; i < n; i++) {
//         char ch = 'A' + i;
//         for (int j = 0; j <= i; j++) {
//             cout << ch << " ";
//         }
//         cout << endl;
//     }
// }

//  ****Pattern-17*****
// void print17(int n) {
//     for (int i = 0; i < n; i++) {
//         // space
//         for (int j = 0; j < n-i-1; j++) {
//             cout << " ";
//         }
//         // characters
//         char ch = 'A';
//         int breakpoint = (2*i+1) / 2;
//         for (int j = 1; j <= 2 * i + 1; j++) {
//             cout << ch;
//             if( j <= breakpoint) ch++;
//             else ch--;
//         }
//         // space
//         for (int j = 0; j < n-i-1; j++) {
//             cout << " ";
//         }
//         cout << endl;
//     }
// }

//  ****Pattern-18*****
// void print18(int n) {
//     for (int i = 0; i < n; i++) {
//         for (char ch = 'E' - i ; ch <= 'E'; ch++) {
//             cout << ch << " ";
//         }
//         cout << endl;
//     }
// }

//  ****Pattern-19*****
// void print19(int n) {
//     int inis = 0;
//     for(int i = 0; i < n; i++) {
//         // stars
//         for(int j = 1; j <= n - i; j++) {
//             cout << "*";
//         }
//         // spaces
//         for(int j = 0; j < inis; j++) {
//             cout << " ";
//         }
//         // stars
//         for(int j = 1; j <= n - i; j++) {
//             cout << "*";
//         }
//         inis += 2;
//         cout << endl;
//     }
//     inis = 2*n-2;
//     for (int i = 1; i <= n; i++) {
//        // stars
//         for(int j = 1; j <= i; j++) {
//             cout << "*";
//         }
//         // spaces
//         for(int j = 0; j < inis; j++) {
//             cout << " ";
//         }
//         // stars
//         for(int j = 1; j <= i; j++) {
//             cout << "*";
//         }
//         inis -= 2;
//         cout << endl;
//     }
// }

//  ****Pattern-20*****
// void print20(int n) {
//     int spaces = 2*n - 2;
//     for (int i = 1; i <= 2 * n - 1; i++) {
//         int stars = i;
//         if(i > n) stars = 2 * n - i;
//         // stars
//         for (int j = 1; j <= stars; j++) {
//             cout << "*";
//         }
//         // spaces
//         for(int j = 1; j <= spaces; j++) {
//             cout << " ";
//         }
//         // stars
//         for (int j = 1; j <= stars; j++) {
//             cout << "*";
//         }
//         cout << endl;
//         if(i < n) spaces -= 2;
//         else spaces += 2;
//     }
// }

//  ****Pattern-21*****
// void print21(int n) {
//     for(int i = 0; i < n; i++) {
//         for(int j = 0; j < n; j++) {
//             if(i == 0 || j == 0 || i == n-1 || j == n-1)
//             {
//                 cout << "*";
//             }
//             else cout << " ";
//         }
//         cout << endl;
//     }
// }

//  ****Pattern-22*****
// void print22(int n){
//     for(int i = 0; i < 2 * n - 1; i++) {
//         for(int j = 0; j < 2 * n -1; j++) {
//             int top = i;
//             int left = j;
//             int right = (2 * n - 2) - j;
//             int down = (2 * n - 2) - i;
//             cout << (n - min(min(top, down) , min(left, right)));
//         }
//         cout << endl;
//     }
// }

// int main()
// {
//     int t;
//     cin >> t;
//     for (int i = 0; i < t; i++)
//     {
//         int n;
//         cin >> n;
//         print9(n);
//     }
// }