#include<stdio.h>

int MultDigits(int iNo)
{
  int iCnt = 0;
  int iCount = 1;
  if(iNo<0)
  {
    iNo = -iNo;
  }
  while(iNo != 0)
  {
    iCnt = iNo%10;
    
    iCount = iCount*iCnt;

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

    iRet = MultDigits(iValue);

    printf("%d",iRet);

    return 0;
  }