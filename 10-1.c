#include<stdio.h>
 double circleArea(float iNo)
 {
    return iNo*iNo*3.14;
 }

 int main()
 {
  float fValue = 0.0;
  float dRet = 0.0;

  printf("Enter Number: ");
  scanf("%f",&fValue);

  dRet =  circleArea(fValue);
  printf("%f",dRet);

  return 0;

 }
