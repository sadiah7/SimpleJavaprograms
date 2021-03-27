class Elseifladder
{
  public static void main(String[] args)
  {
    int a,b,c;
    a=10;
    b=30;
    c=20;
    if(a>b && a>c)
    {
      //this is the new addition
      System.out.println(a + " is max");
    }
    else if(b>a && b>c)
    {
      System.out.println(b +" is max");
    }
    else
    {
      System.out.println(c + " is max");
    }
  }
}
