import java.util.*;

class Logic
{
  void sumOfDigits(int iNo)
  {   int iCnt = 0;
    int iCount = 0;
      int iSum = 0;
      for(iCnt = 0;iCnt<iNo;iCnt++)
      {
        iCount = iNo%10;
        iSum = iSum + iCount;
        iNo = iNo/10;
      }
      System.out.println("Sum of digits is : "+iSum);
  }
}

class program1
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner (System.in);
    int iValue = 0;
    
    System.out.println("Enter number : ");
    iValue = sobj.nextInt();
    
    Logic obj = new Logic();
      obj.sumOfDigits(iValue);
  }
}