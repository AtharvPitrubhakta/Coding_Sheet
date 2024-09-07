#include <stdio.h>

int main()
{
    int marks;

    printf("-----------------------------\n");
    printf("Enter Your Marks Between 0 t0 100:\n");

    printf("Enter Your Marks:\n");
    scanf("%d", &marks);

    if (marks > 100)
    {
        printf("Don't be smart Enter your marks between limit\n");
    }
    else
    {

        switch (marks / 10)
        {
        case 10:
        case 9:
            printf("Your grade is: A \n");
            break;

        case 8:
            printf("Your grade is: B \n");
            break;

        case 7:
            printf("Your grade is: C \n");
            break;

        case 6:
            printf("Your grade is: D \n");
            break;

        default:
            printf("Your grade is: F \n");
        }
    }
    return 0;
}