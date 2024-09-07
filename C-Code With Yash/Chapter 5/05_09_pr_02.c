// write a function to convert celsius temperature into fahrenheit.
// Celsius to Fahrenheit : (°C × 9/5) + 32 = °F
// Fahrenheit to Celsius : (°F − 32) × 5/9 = °C

#include<stdio.h>
float temperature(float celsius);

int main()
{
    float f;
    printf("The temperature of celsius is:\n");
    scanf("%f", &f);
    printf("The temperature of Celsius into fahrenheit is: %f", temperature(f));

    return 0;
}

float temperature(float celsius)
{
    float fahrenheit = celsius * 9/5 + 32;
    return fahrenheit;
}
