import java.util.*;

class DisplayDigits
{
  public static void DisplayDigit(int iNo)
  {
    int iDigit = 0;
    if(iNo<0)
    {
      iNo = -iNo;
    }
    while(iNo!=0)
    {
      iDigit = iNo%10;
      System.out.println(iDigit+"\n");
      iNo = iNo/10;
    }
  }
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    int ivalue = 0;
  
    System.out.println("Enter Number");
    ivalue = sobj.nextInt();
  
    DisplayDigit(ivalue);
  }

}