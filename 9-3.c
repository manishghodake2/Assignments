#include<stdio.h>

int CountRange(int iNo)
{
  int iCnt = 0;
  int iCount = 0;
  if(iNo<0)
  {
    iNo = -iNo;
  }
  while(iNo != 0)
  {
    iCnt = iNo%10;
    
    if(iCnt>=3 && iCnt<=7)
    {
      iCount++;
    }
    iNo = iNo/10;
  }
  return iCount;

}
  
  int main()
  {
    int iValue = 0;
    int iRet  = 0;
    printf("Enter Number:\n");
    scanf("%d",&iValue);

    iRet = CountEven(iValue);

    printf("%d",iRet);

    return 0;
  }