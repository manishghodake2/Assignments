<<<<<<< HEAD
class Logic
{
  void Findmin(int a, int b, int c)
  {
    int temp = a;
      if(temp<b && temp<c)
      { 
        System.out.println("Smallest Number is \n"+ temp);
      }
      else if(b<temp && b<c)
      {
        System.out.println("Smallest Number is\n"+b);
      }
      else
      {
        System.out.println("Smallest Number is:\n"+c);
      }
      }
}
  class program4
  {
    public static void main(String A[])
    {
    Logic obj = new Logic();
    obj.Findmin(11,9,42);
    }
}
=======
import java.util.*;

class CntTwo
{
  public int CountTwo(int iNo)
  {
    int iDigit = 0;
    int iCount = 0;
    while(iNo!=0)
    {
      iDigit = iNo%10;

      if(iDigit == 4)
      {
        iCount++;
      }
      iNo = iNo/10;
    }
    return iCount;
  }
}
class program4 
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    int iValue = 0;
    int iRet = 0;

    System.out.println("Enter number");
    iValue = sobj.nextInt();
    CntTwo nobj = new CntTwo();

    iRet = nobj.CountTwo(iValue);
    System.out.println("Count of 4 is\n"+iRet);
  }
}
>>>>>>> 0557e45e7dfaeb49ea45414e836ae6436c724df8
