
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
class program5
{
  public static void main(String A[])
  {
    logic obj = new logic();
    obj.Printtable(5);
  }
}