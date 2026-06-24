#include<stdio.h>

int DollerToInr(int iDoller)
{
  return iDoller *70;
}

int main()
{
  int iValue = 0, iRet = 0;
  printf("Enter Number\n");
  scanf("%d",&iValue);
  iRet = DollerToInr(iValue);
  printf("Value in INR is %d",iRet);

  return 0;

}