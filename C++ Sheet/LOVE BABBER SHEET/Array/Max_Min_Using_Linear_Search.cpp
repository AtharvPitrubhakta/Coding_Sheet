#include<iostream>
#include<limits.h>
using namespace std;

int get_Max(int arr[], int size) {
    
    int maxi = INT_MIN;

    for(int i = 0; i < size; i++){
        if(arr[i] > maxi) {
            maxi = arr[i];
        }
    }

    return maxi;
}

int get_Min(int arr[], int size) {

    int mini = INT_MAX;

    for(int i = 0; i < size; i++)
    {
        if(arr[i] < mini) {
            mini = arr[i];
        }
    }
    
    return mini;  
}
    

int main()
{
    int arr[] = {23, 4, 2, 44, 84, 92, 54, 64, 35, 18};
    int size = 10;

    cout << "Maximum Element is: " << get_Max(arr, size) << endl;
    cout << "Minimum Element is: " << get_Min(arr, size) << endl;
    
    return 0;

}


// -------------------------------------------------

// Without Using Function

// int main()
// {
//     int arr[] = {2, 4, 1, 6, 8, 9, 0, 1};
//     int size = 8;

//     // Initialize the maxi variable with the minimum possible integer value
//     int maxi = INT_MIN;
//     int mini = INT_MAX;

//     for(int i = 0; i < size; i++)
//     {
//         // Found a number greater than maxi, update maxi
//         if(arr[i] > maxi)
//         {   
//             maxi = arr[i];
//         }
//         if(arr[i] < mini)
//         {
//             mini = arr[i];
//         }
//     }

//     cout << "Maximum Number is: " << maxi << endl;
//     cout << "Minimum Number is: " << mini << endl;
// }