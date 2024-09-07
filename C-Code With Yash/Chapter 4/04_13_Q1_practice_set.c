// write a program to print multiplication table of a given number n.

#include<stdio.h>

int main()
{
    int n;
    printf("****Multiplication table of N Value: ****:\n\n");
    scanf("%d", &n);

    for(int i=1; i<=10; i++)
    {
        printf("%d  x i = %d\n",n,n*i);     
    }
    return 0;
}