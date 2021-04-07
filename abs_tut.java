abstract class temp
{
  abstract void show(); //to use abstract method class must be abstract
  void add(){}
}
class Aclass extends temp
{
  void show()
  {
    System.out.println("A class method");
  }
}
class abs_tut
{
  public static void main(String[] args)
  {
    Aclass a1 = new Aclass();
    a1.show();
  }
}
