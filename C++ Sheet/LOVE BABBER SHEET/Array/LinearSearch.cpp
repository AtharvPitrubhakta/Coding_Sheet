#include<bits/stdc++.h>
using namespace std;

bool search(int arr[], int size, int key) {

    for(int i = 0; i < size; i++) {

        // key element is equal or not
        if( arr[i] == key ) {
            return 1;
        }
    }
    return 0;
}
 

int main() {

    int arr[10] = { 5, -7, 13, 22, 6, -4, 1, 22, 34, 12};

    cout << " Enter the element to search for: " << endl;

    int key;
    cin >> key;

    // Function called
    bool found = search(arr, 10, key);

    if( found ) {
        cout << " Key is present " << endl;
    }
    else {
        cout << " Key is absent " << endl;
    }


    return 0;
}