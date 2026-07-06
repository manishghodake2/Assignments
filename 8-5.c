#include<stdio.h>

  double SquareMeter(int iValue)
{
  return iValue*0.0929;
}

int main()
{
  int iValue = 0;
  double  dRet = 0.0;

  printf("Enter Area in Square Feet\n");
  scanf("%d",&iValue);

  dRet = SquareMeter(iValue);

  printf("Area in Square Meter is: %f\n",dRet);

  return 0;

}