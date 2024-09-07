#include<iostream>
using namespace std;

void update(int arr[], int n) {
    cout << endl << "Inside the Function" << endl;

    // printing the array
    for(int i = 0; i < 3; i++) {
        cout << arr[i] << " ";
    } cout << endl;


    cout << "Going back to main Function " << endl;
}


int main() {

    int arr[3] = {120,2,3};

    update(arr , 3);

    // printing the array
    cout << endl << "Printing the main function " << endl;
    for(int i = 0; i < 3; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}