#include<bits/stdc++.h>
using namespace std;

void fun(int a[], int n)
{
    cout << sizeof(a) << endl;
    for(int i = 0; i < n; i++)
        cout << a[i] << " ";
  
}

int main()
{
    int arr[5] = {1, 3, 2, 6, 7};
    cout << sizeof(arr) << endl;
    fun(arr, 5);
    
}