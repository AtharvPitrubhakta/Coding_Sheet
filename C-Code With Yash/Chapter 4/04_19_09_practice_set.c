#include<stdio.h>

int main()
{
    int i=1, n, fact=1;
    printf("Enter the value:\n");
    scanf("%d", &n);
    
    while(i<=n)
    {
        fact *= i;
        i++;

    }
    printf("The value of fact %d is %d", n, fact);  

    return 0;

}