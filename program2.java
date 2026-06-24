import java.util.*;

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

