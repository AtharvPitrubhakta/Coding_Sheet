#include<stdio.h>

int main()
{
    int n, i=1, sum=0;
    scanf("%d", &n);
    do{
        sum +=i;
        i++;
    }while(i<=n);

    printf("The value of sum(1 to 10) is %d", sum);
    return 0;
}