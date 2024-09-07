// Write a program using functions to find average of three numbers.\

#include<stdio.h>
float average(int a, int b, int c);

int main()
{
    int a, b, c;
    printf("The value of a is\n");
    scanf("%d", &a);
    printf("The value of b is\n");
    scanf("%d", &b);
    printf("The value of c is\n");
    scanf("%d", &c);
    printf("The value of average is %f",average(a, b, c));
    return 0;
}

float average(int a, int b, int c)
{
    float result;
    result = (float)(a + b + c) / 3;
    return result;
}