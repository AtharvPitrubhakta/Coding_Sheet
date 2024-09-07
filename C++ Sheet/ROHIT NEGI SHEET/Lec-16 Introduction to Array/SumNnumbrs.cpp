#include<bits/stdc++.h>
using namespace std;

int main()
{
    // int arr[6] = {1 , 5, 6, 3, 8, 10};

    // int sum = 0;

    // for(int i = 0; i < 6; i++)
    // {
    //     sum += arr[i]; 
    // }

    // cout << sum << endl;


    int size;
    cin >> size;
    int arr[1000];

    int sum = 0;

    for(int i = 0; i < size; i++)
    cin >> arr[i];

    for(int i = 0; i < size; i++)
    sum += arr[i];

    cout << sum << endl;


    return 0;
}