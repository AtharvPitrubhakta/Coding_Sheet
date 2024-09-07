#include<stdio.h>

int main()
{
    int i = 5;
    printf("The value of after i++ %d\n", ++i);
    i++; // ---> Pehle print kare fir increment 
    ++i; // ---> Pehle increment fir print kare 
    printf("The value of i is %d\n", i);

    i+=10; // Increment is by 10
    printf("The value of i is %d\n", i);
    return 0;
}