#include <stdio.h>

int main()
{
    int n, prime = 1, i = 2;

    printf("Enter the value:\n");
    scanf("%d", &n);

    do
    {
        if (n % i == 0)
        {
            prime = 0;
            break;
        }
        i++;
    } while (i < n);

    if (prime == 0)
    {
        printf("This is not a prime number");
    }
    else
    {
        printf("This is a prime number");
    }

    return 0;
}