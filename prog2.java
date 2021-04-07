class prog2
{
  public static void main(String args[]) {
    int n,a=0,b=1,c;
    n = Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++)
    {
      c=a+b;
      System.out.println(a);
      a=b;
      b=c;
    }
  }
}
