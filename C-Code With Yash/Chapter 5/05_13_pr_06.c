#include <stdio.h>
int sum(int a, int b);

int main()
{
    int a, b;
    printf("Enter first number:\n");
    scanf("%d", &a);
    printf("Enter second number:\n");
    scanf("%d", &b);
    printf("The value of sum is %d\n", sum(a, b));
    return 0;
}

int sum(int a, int b)
{
    int n;
    n = a + b;
    return n;
}