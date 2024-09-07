#include<iostream>
using namespace std;

int main(){

    int TotalAmount;
    cout << "Enter The Total Amount: " << endl;
    cin >> TotalAmount;
    int RS100 , RS50 , RS20 , RS1; 

    cout << endl;

    switch( 1 ){

        case 1: RS100 = TotalAmount / 100;
                TotalAmount = TotalAmount % 100;
            cout << "No of 100 Rupees notes required are "<< RS100 << endl; 

        case 2: RS50 = TotalAmount / 50;
                TotalAmount = TotalAmount % 50;
            cout << "No of 50 Rupees notes required are "<< RS50 << endl;
        
        case 3: RS20 = TotalAmount / 20;
                TotalAmount = TotalAmount % 20;
            cout << "No of 20 Rupees notes required are "<< RS20 << endl;     

        case 4: RS1 = TotalAmount / 1;
                TotalAmount = TotalAmount % 1;
            cout << "No of 1 Rupees notes required are "<< RS1 << endl;     
        default: cout << "This is not a valid number " << endl;
    }
}