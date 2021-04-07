interface p
{
  int a = 10;
  void show();
}
interface p1 extends p
{
  int b= 20;
  void show();
}
interface p2 extends p
{
  int c = 20;
  void show();
}
interface p12 extends p1,p2
{
  int d = 20;
  void show();
}
class test implements p12
{
  public void show()
  {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}
class interface_tut
{
  public static void main(String[] args)
  {
    test t1 = new test();
    t1.show();
  }
}
