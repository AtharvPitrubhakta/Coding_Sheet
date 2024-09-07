#include<stdio.h>

int main()
{
    char ch;
    // 97 - 122 = a - z ASCII(American Statndard For Information Interchange) Values

    printf("Enter the character:\n");
    scanf("%c", &ch);
    
    if(ch<=122 && ch>=97)
    {
        printf("It is Lowercase\n");
    }
    else{
        printf("It is not Lowercase\n");
    }
    return 0;
}