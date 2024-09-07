#include<bits/stdc++.h>
using namespace std;

// Functions are set of code which performs something for you
// Functions are used to modularise code
// Functions are used to increase readability 
// Functions are used to use same code multiple times
// void -> which does not returns anything
// return 
// parameterized 
// non parameterized

// void printname(string name){
//     cout << "hey " << name << endl;
// } 

// int main(){
//     string name;
//     cin >> name;
//     printname(name);

//     string name2;
//     cin >> name2;
//     printname(name2);

//     return 0;
// }   


// Take two numbers and print its sum

int sum (int num1, int num2) {
    int num3 = num1 + num2; // 5 + 6
    return num3;

// Different ways of write of code here 

// void sum (int num1, int num2) {
//     int num3 = num1 + num2; // 5 + 6
//     cout << num3;
}     


int main() {
    int num1 , num2;
    cin >> num1 >> num2;
    int res = sum(num1 , num2);
    cout << res;
    return 0 ;

    // int num1 , num2;
    // cin >> num1 >> num2;
    // sum(num1 , num2);
    // return 0 ;
}



