#include<iostream>
using namespace std;

int main()
{
    int arr[1000];

    int n;
    cout << "Enter the size of array: ";
    cin >> n;

    for(int i = 0; i < n; i++)
    cin >> arr[i];

    
    // Insertion Sort - (Increasing Order to start first element))

    // for(int i = 1; i < n; i++)
    // {
    //     for(int j = i; j > 0; j--)
    //     {
    //         if(arr[j] < arr[j - 1])
    //         swap(arr[j] , arr[j - 1]);
    //         else 
    //         break;
    //     }
    // }

    // Insertion Sort - (Increasing Order to start last element)

    for(int i = n-2; i >= 0; i--)
    {
        for(int j = i; j < n; j++)
        {
            if(arr[j] > arr[j + 1])
            swap(arr[j] , arr[j + 1]);
            else 
            break;
        }
    }

    // Insertion Sort - (Decreasing In Order)

    // for(int i = 1; i < n; i++)
    // {
    //     for(int j = i; j > 0; j--)
    //     {
    //         if(arr[j] > arr[j - 1])
    //         swap(arr[j] , arr[j - 1]);
    //         else 
    //         break;
    //     }
    // }

    for(int i=0; i<n; i++)
    cout << arr[i] << " ";


    return 0;
}