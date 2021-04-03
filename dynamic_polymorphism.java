class A
{
  void show()
  {
    System.out.println("A class method");
  }
}
class B extends A
{
  void show()
  {
    System.out.println("B class method");
  }
  void temp()
  {}
}
class dynamic_polymorphism{
  public static void main(String[] args) {
    A a1 = new A();
    a1.show();
    A a2 = new B();
    a2.show(); // superclass referencing sublass, only possible when method overriding is present
    /*a2.temp();
    dynamic_polymorphism.java:23: error: cannot find s
ymbol
    a2.temp();
      ^
  symbol:   method temp()
  location: variable a2 of type A
1 error
    */
  }
}
// output
// A class method
// B class method
