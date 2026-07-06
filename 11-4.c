#include<stdio.h>

int RangeSumEven(int iStart,int iEnd)
{
  int iCnt = 0;
  int iSum = 0;

  if(iStart < 0 || iStart > iEnd )
  {
    printf("Invalid Range");
    return -1;
  }

  for(iCnt = iStart; iCnt<=iEnd; iCnt++)
    {
      if(iCnt%2 == 0)
      {
      iSum = iSum+iCnt;
    }
  }
    return iSum;
  
}
int main()
{
  int iValue1 = 0, iValue2 = 0;
  int iRet = 0;

  printf("Enter Starting Number\n");
  scanf("%d",&iValue1);
  printf("Enter Ending Number\n");
  scanf("%d",&iValue2);

  iRet = RangeSumEven(iValue1,iValue2);

  printf("Addition is %d",iRet);

  return 0;
  
}