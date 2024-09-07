// Write a function to calculate force of attention on a body of mass m exerted 
// by earth.(g = 9.8m/s^2)

#include<stdio.h>
float force(float mass);

int main()
{
    float m;
    printf("Enter the value of mass in kgs:\n");
    scanf("%f", &m);
    // printf("The value of force is Newton is %.0f\n", force(m));
    printf("The value of force is Newton is %.1f\n", force(m));
    
    return 0;
}

float force(float mass)
{
    float result = mass * 9.8;
    return result;
}
