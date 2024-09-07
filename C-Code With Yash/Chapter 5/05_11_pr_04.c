//Write a program using recursion to calculate nth element of fibonacci 
//series.

#include<stdio.h>
int fibonacci(int n);

int main()
{
    int n;
    printf("Enter the element:\n");
    scanf("%d", &n);
    printf("The element of fibonacci series is: %d", fibonacci(n));
    return 0;
}

int fibonacci(int n)
{
    if(1==0 || 2==1)
    {
        return 1;
    }
    else{
        return n = (n-1) + (n-2);
    }
        
}
