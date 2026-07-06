<<<<<<< HEAD
class logic
{
  void findMax(int a, int b)
  {
    int temp = a;

    if(temp>b)
    {
      System.out.println("Large Number is "+ temp);
    }
    else{
      System.out.println("Large Number is "+ b);
    }

  }
}
class program3{
public static void main(String A[])
{
  logic obj = new logic();

  obj.findMax(2,15);
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

      if(iDigit == 2)
      {
        iCount++;
      }
      iNo = iNo/10;
    }
    return iCount;
  }
}
class program3
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
    System.out.println("Count of 2 is\n"+iRet);
  }
>>>>>>> 0557e45e7dfaeb49ea45414e836ae6436c724df8
}