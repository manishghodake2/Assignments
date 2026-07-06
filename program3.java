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
}