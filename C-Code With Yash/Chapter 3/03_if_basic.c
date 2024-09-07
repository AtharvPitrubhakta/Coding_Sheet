#include<stdio.h>

int main()
{
    int a , b;
    printf("Enter a number:\n");
    scanf("%d", &a);

    if(a % 2 == 0)
    {
        printf("%d Number is Even \n", a);
    }
    else
    {
        printf("%d Number is Odd \n", a);
    }
    
    return 0;
}