#include<iostream>
using namespace std;

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
    int size = 8;

    int start = arr[0];
    int end = arr[size - 1];

    for(int i = 0; i < size; i++)
    {
        cout << start;
        cout << end; 
    }

    return 0;
}