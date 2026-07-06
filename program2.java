import java.util.*;

class Logic
{
  void Palindrome(int iNo)
  {
  int iRev = 0;
  int iCount = 0;
  int iTemp = iNo;
  while(iNo!= 0)
  {
    iCount = iNo%10;
    iRev = (iRev*10)+iCount;
    iNo = iNo/10;
  }
  if(iRev == iTemp)
  {
    System.out.println("Number is Palindrome");
  }else 
  {
    System.out.println("Number is Not Palindrome");
  }
}
}
class program2
{
public static void main(String A[])
{
  Logic obj = new Logic();
  obj.Palindrome(12241);
}
}