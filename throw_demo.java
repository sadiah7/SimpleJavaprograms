class zero extends Exception
{
  zero()
  {
    System.out.println("custom exception");
  }
}
class throw_demo
{
  public static void main(String[] args)
  {
    try
    {
      int a;
      a = Integer.parseInt(args[0]);
      if(a==0)
      {
        throw new zero();
      }
    }
    catch(zero z)
    {
      System.out.println("First arg is zero");
    }
  }
}
