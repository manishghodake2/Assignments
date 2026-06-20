#include<stdio.h>

double FhtoCs(float fTemp)
{
  
  return  (fTemp-32)*(5.0/9.0);
}

int main()
{
  float fValue = 0.0;
  double dRet = 0;

  printf("Enter Fahrenheit\n");
  scanf("%f",&fValue);

  dRet = FhtoCs(fValue);

  printf("Area of Circlr is : %f\n",dRet);
  
  return 0;

}