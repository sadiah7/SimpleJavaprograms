class demo
{
  static int a = 0;
  demo()
  {
    a++;
  }
  static void show()
  {
    System.out.println(a);
  }
}
class staticdemo
{
  //static // example of static block
  //{
  //  System.out.println("Static block");
  //}
  public static void main(String[] args)
  {
    //System.out.println("main method");
    demo d1 = new demo();
    demo d2 = new demo();
    demo d3 = new demo();

    //d1.show();
    //d2.show();
    //d3.show();
    demo.show();
  }
}
//output 1 1 1 without adding static
//output 3 3 3 with adding static to variable a;
// all variables share same memory space when static keyword is used
//output when static is used with method
