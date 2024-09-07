#include<stdio.h>
void display(); // Function Prototype

int main()
{
    int a;
    printf("Initializing display function\n");
    display();// Function Call
    printf("Display fucntion finished its work\n");
    return 0;
}

// Function Definition
void display(){
    printf("This is display\n");
}