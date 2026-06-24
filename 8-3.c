#include<stdio.h>

  int KmtoMeter(int iNo)
{
  return iNo*1000;
}

int main()
{
  int iValue = 0, dRet = 0;

  printf("Enter KM\n");
  scanf("%d",&iValue);

  dRet = KmtoMeter(iValue);

  printf("Km to Meter is: %d\n",dRet);

  return 0;

}