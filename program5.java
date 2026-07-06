<<<<<<< HEAD

class logic 
{
  void Printtable(int iNo)
  {
    int iCnt = 0;

    for(iCnt = 1;iCnt<=10;iCnt++)
    {

      System.out.println("Table is \n"+(iNo*iCnt));
    }
  }
}
=======
import java.util.*;
class CountX
{
  public int Count(int iNo)
  {
    int iDigit = 0;
    int iCount = 0;

    while(iNo!=0)
    {
      iDigit = iNo%10;

       if(iDigit<6)
      {
      iCount++;
      }
       iNo = iNo/10;
    }
    return iCount;
  }
  
}

>>>>>>> 0557e45e7dfaeb49ea45414e836ae6436c724df8
class program5
{
  public static void main(String A[])
  {
<<<<<<< HEAD
    logic obj = new logic();
    obj.Printtable(5);
=======
    Scanner sobj = new Scanner(System.in);
    int iValue = 0;
    int bRet = 0;

    System.out.println("Enter NUmber");
    iValue = sobj.nextInt();

    CountX nobj = new CountX();
    bRet = nobj.Count(iValue);

    System.out.println("Value less than 6 is \n"+bRet);

>>>>>>> 0557e45e7dfaeb49ea45414e836ae6436c724df8
  }
}