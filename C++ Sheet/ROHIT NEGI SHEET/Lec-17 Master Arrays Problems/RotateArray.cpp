#include<iostream>
using namespace std;

int rotateArray(int arr[], int n) {
    
    int temp = arr[n - 1];

    for(int i = n - 2; i >= 0; i--) 
    {
        arr[i + 1] = arr[i];
    }

    arr[0] = temp;

}

int main(){
    int arr[6] = {2, 7, 4, 11, 5, 8};
    rotateArray(arr, 6);
   

    return 0;
}