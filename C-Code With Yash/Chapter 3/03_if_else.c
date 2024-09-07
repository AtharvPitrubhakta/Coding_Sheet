#include<stdio.h>

int main()
{
    int age;

    printf("Enter your age:\n");
    scanf("%d", &age);

    // if(age!=90)
    // if((age <= 70 && age >=18) || (VipPass == 1))
    if(age>90)
    {
        printf("Your are above 90 , you cannot drive\n");
    }
    else
    {
        printf("You can drive\n");
    }

    if(age == 50)
    {
        printf("Half Century\n");
    }

    return 0;
}   