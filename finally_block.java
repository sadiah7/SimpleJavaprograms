class test
{
  void div() throws ArithmeticException,ArrayIndexOutOfBoundsException
  {
    int c =5/0;
  }
}
class finally_block
{
  public static void main(String[] args) {
    int a,b,c;
    test t1 = new test();
    try
    {
      t1.div();
      // a = Integer.parseInt(args[0]);
      // b = Integer.parseInt(args[1]);
      // c=a/b;
      // System.out.println("c = "+c);
    }
    catch (ArithmeticException e)
    {
      System.out.println("ArithmeticException is generated");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("ArrayIndexOutOfBoundException is generated");
    }
    finally
    {
      System.out.println("finally block");
    }
  }
}
