#include<iostream>
using namespace std;

void printArray(int arr[], int size) {
    cout << "printing the array " << endl;
    // print the array
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl; 
    cout << "printing done " << endl;
}

int main(){

    // declare
    int number[15];

    // accessing the array
    cout << "Value at 14 index " << number[14] << endl;

    // cout << "Value at 20 index" << number[20] << endl;"
    
    // Initialising an array
    int second[3] = {5, 7, 11};

    // accessing an element
    cout << "Value at 2 index " << second[2] << endl;

    // Initialising an array
    int third[15] = {2, 7};
    
    int n = 15;
    // printArray(third, 15);
    // cout << "printing the array " << endl;
    // // print the array
    // for (int i = 0; i < n; i++) {
    //     cout << third[i] << " ";
    // }
    
    // int thirdSize = sizeof(third) / sizeof(int);
    // cout << "Size of third is: " << thirdSize << endl;

    cout << endl;
    
    //initializing all locations with 0
    int fourth[10] = {0};
    n = 10;
    // printArray(fourth, 10);
    // cout << "printing the array " << endl;
    // // print the array
    // for (int i = 0; i < n; i++) {
    //     cout << fourth[i] << " ";
    // }
    
    // int fourthSize = sizeof(fourth) / sizeof(int);
    // cout << "Size of fourth is: " << fourthSize << endl;

    cout << endl;
    
    int fifth[10];
    std::fill_n(fifth, 10, 1);
    n = 10;
    // printArray(fifth, 10);
    // cout << "printing the array " << endl;
    // // print the array
    // for (int i = 0; i < n; i++) {
    //     cout << fifth[i] << " ";
    // }

    // int fifthSize = sizeof(fifth) / sizeof(int);
    // cout << "Size of Fifth is: " << fifthSize << endl;
    cout << endl;

    char ch[5] = {'a', 'b', 'c', 'r', 'p'};
    cout << ch[3] << endl;

    cout << " Printing the array " << endl;
    // print the array
    for(int i = 0; i < 5; i++) {
        cout << ch[i] << " ";
    }
    cout << "Printing Done" << endl;
    double firstDouble[5];
    float firstFloat[6];
    bool firstBool[9];


    cout << endl << "Everything is fine " <<endl << endl;
}

