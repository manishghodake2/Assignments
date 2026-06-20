#include<stdio.h>

int kmToMeter(int iNo)
{
  return iNo*1000;

}

int main()
{
int iValue = 0;
int iRet = 0;

printf("Enter Distance \n");
scanf("%d",&iValue);

iRet = kmToMeter(iValue);

printf("Kilometer to Meter Distance is:%d ",iRet);

return 0;

}