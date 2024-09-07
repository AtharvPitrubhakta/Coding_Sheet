#include<stdio.h>

int main()
{       
    int num1, num2, num3, num4;

    printf("Enter First Number:\n");
    scanf("%d", &num1);
    printf("Enter Third Number:\n");
    scanf("%d", &num2);
    printf("Enter Second Number:\n");
    scanf("%d", &num3);
    printf("Enter Fourth Number:\n");
    scanf("%d", &num4);

    if(num1 > num2 && num1 > num3 && num1 > num4)
    {
        printf("Num1 = %d is a Greatest Number", num1);
    }
    else if (num2 > num1 && num2 > num3 && num2 > num4)
    {
        printf("Num2 = %d is a Greatest Number", num2);
    }
    else if (num3 > num1 && num3 > num2 && num3 > num4)
    {
        printf("Num3 = %d is a Greatest Number", num3);
    }
    else if (num4 > num1 && num4 > num2 && num4 > num3)
    {
        printf("Num4 = %d is a Greatest Number", num4);
    }   
    else{
        printf("-------Try To Next Time-------\n");
    }
    
    return 0;
}
