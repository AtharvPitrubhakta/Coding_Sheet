// Age of a person is given, print Adult if his/her age is greater than 18, otherwise print Teenager.

#include<iostream>
using namespace std;

int main()
{

    int age;

    cout <<"Enter your age: ";
    cin >> age;

    if(age >= 18)
    {
        cout <<"You are Adult";
    }
    else{
        cout <<"You are Teenager";
    }

    return 0;
}