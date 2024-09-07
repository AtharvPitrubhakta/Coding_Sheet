// Find minimum and maximum element in an array

#include<bits/stdc++.h>
using namespace std;

int main()
{
    int a[1000];
    int n;
    cout <<"Enter the size of the array: ";
    cin >> n;
    for(int i = 0; i < n; i++)
    cin >> a[i];

    for(int i = 0; i <= n; i++)
    {
        max(a[i], a[i + 1]);
        return;
        min(a[i], a[i + 1]);
        return;
    }
    


    for(int i = 0; i < n; i++)
    {
        cout << a[i] << " ";
    }
        

    return 0;
}