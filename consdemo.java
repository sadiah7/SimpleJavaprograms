class demo
{
  demo()
  {
    System.out.println("default constructor");
  }
  demo(int x)
  {
    System.out.println("parameter constructor : " + x);
  }
}
class consdemo
{
  public static void main(String args[])
  {
    demo d1 = new demo();
    demo d2 = new demo(10);
  }
}
