class try_catch3
{
  public static void main(String[] args) {
    int a,b,c;
    try
    {
      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
        try
        {
          c=a/b;
          System.out.println("c = "+c);
        }
        catch (ArithmeticException e)
        {
          System.out.println("ArithmeticException is generated");
        }
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("ArrayIndexOutOfBoundException is generated");
    }
  }
}
