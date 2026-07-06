#include<stdio.h>

void ReverseTable(int iNo)
{
  int iCnt = 0;
  int iTable = 1;
  if(iNo<0)
  {
    iNo = -iNo;
  }
  for(iCnt =10;iCnt>=1;iCnt-- )
  {
    iTable = iCnt*iNo;
    printf("%d\t",iTable);
  }
  
}
 int main()
 {
  int iValue = 0;
  printf("Enter Number\n");
  scanf("%d",&iValue);
  ReverseTable(iValue);
   return 0;
 }

