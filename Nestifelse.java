class Nestifelse
{
  public static void main(String[] args)
  {
    int a,b,c;
    a=10;
    b=20;
    c=30;
    if(a>b)
    {
      if(a>c)
      {
        System.out.println(a + " is max");
      }
      else
      {
        System.out.println(c + " is max");
      }
    }
    else
    {
        if(b>c)
        {
          System.out.println(b + " is max");
        }
        else
        {
          System.out.println(c + " is max");
        }
    }
  }
}
