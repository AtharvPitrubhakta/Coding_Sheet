#include<stdio.h>

int main()
{
    int n, i=1, sum=0;
    scanf("%d", &n);

    // for(i=0; i<=n; i++){
        // sum += i;
    // }
    
    while(i<=n){
        sum += i;
        i++;
    }

    printf("The value of sum(1 t0 10) is %d",sum);
    return 0;
}