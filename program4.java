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
