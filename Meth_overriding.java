class Aclass
{
  void show()
  {
    System.out.println("A class Method");
  }
}
/* Bclass takes up memory of Aclass method when b1.show() is called */
class Bclass extends Aclass
{
  void show()
  {
    System.out.println("B class Method");
  }
}
class Meth_overriding
{
  public static void main(String[] args)
  {
    Bclass b1 = new Bclass();
    b1.show();
    Aclass a1 = new Aclass();
    a1.show();
  }
}
