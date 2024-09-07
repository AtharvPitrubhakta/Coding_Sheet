#include<stdio.h>

int main()
{
    int java, python, android;
    float total;

    printf("Enter Java Marks:\n");
    scanf("%d", &java);
    
    printf("Enter Python Marks:\n");
    scanf("%d", &python);
    
    printf("Enter Android Marks:\n");
    scanf("%d", &android);

    total = (java + python + android)/3;

    if( total < 40 || java<33 || python<33 || android<33 )
    {
        printf("Your total percentage is %f and you are fail\n", total);
    }
    else{
        printf("Your total percentage is %f and you are pass\n", total);
    }
    return 0;
}