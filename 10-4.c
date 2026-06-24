#include<stdio.h>

double fhToCs(float fNo)
{
  return (fNo-32.0)*(5.0/9.0);
}

int main()
{
  float fValue = 0.0;
  double fRet = 0.0;

  printf("Enter Fahrenheit:\n");
  scanf("%f",&fValue);

  fRet = fhToCs(fValue);

  printf("Fahrenheit to Celcius is : %f",fRet);

  return 0;


}
