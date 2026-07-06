import java.util.*;

<<<<<<< HEAD
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
=======
class ChkZero
{
  public boolean CheckZero(int iNo)
  {
    while(iNo != 0)
    {
      if(iNo%10 == 0)
      {
          return true;
      }

      iNo = iNo/10;
      }
      return false;
    }
} 

  class program2
  {
    public static void main(String A[])
    {
      Scanner sobj = new Scanner(System.in);
      int iValue = 0;
      boolean bRet = false;
      System.out.println("Enter Number");
      iValue = sobj.nextInt();
      
      ChkZero nobj = new ChkZero();

      bRet = nobj.CheckZero(iValue);

      if(bRet == true)
      {
        System.out.println("It Contains Zero");
      }else
      {
        System.out.println("It does not Contains Zero");
      }

    }
  }

>>>>>>> 0557e45e7dfaeb49ea45414e836ae6436c724df8
