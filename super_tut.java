class superclass
{
  int a = 10;
  void show()
  {
    System.out.println("super class method");
  }
}
class subclass extends superclass
{
  int a = 20; //first priority to local variable
  void show()
  {
    System.out.println("a = "+a);
    System.out.println("a = "+ super.a);
     //calls immediate parent class value
     super.show(); // if we only call show() then we will get into infinite looping
  }
}
class super_tut
{
  public static void main(String[] args) {
    subclass s1 = new subclass();
    s1.show();
  }
}
