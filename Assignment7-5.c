#include<stdio.h>

int FactorialDiff(int iNo)
{
  int iCnt = 0;
  int iFact1 = 1; 
  int iFact2 = 1;
  if(iNo <0)
  {
    iNo = -iNo;  
  }

  for(iCnt = 1;iCnt<=iNo;iCnt++)
    {
      if(iCnt%2 == 0)
      {
         iFact2 = iFact2*iCnt;

      }
      else
      {
         iFact1 = iFact1*iCnt;
      }
    }
    return iFact2-iFact1; 
  }
    

int main()
{
  int iValue = 0, iRet = 0;
  printf("Enter Number\n");
  scanf("%d",&iValue);
  iRet = FactorialDiff(iValue);
  printf("Odd Factorial are %d",iRet);

  return 0;

}