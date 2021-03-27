class demo
{
  int a=10;
  void show()
  {
    System.out.println("class");
  }
  public static void main(String args[])
  {
    demo d1 = new demo();
    d1.show();
    System.out.println(d1.a);
  }
}
