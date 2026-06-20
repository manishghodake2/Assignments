#include<stdio.h>
 double squareMeter(float fNo)
 {
  return fNo*0.0929; 
 }

 int main()
 {
  float fValue = 0.0;
  double fRet = 0.0;

  printf("Enter Value of Square Meter\n");
  scanf("%f",&fValue);

  fRet = squareMeter(fValue);

  printf("Value in Meter is: %f",fRet);

  return 0;
 }