/* Hierchichal Level Inheritance */
class Aclass
{
 int a;
}
class Bclass extends Aclass // Bclass is subclass of Aclass
{
  void add()
  {
    a = 200;
    System.out.println("add = "+ a);
  }
}
class Cclass extends Aclass //Cclass is subclass of Aclass
{                           //Cclass cannot access values of Bclass
  int c;
  void add()
  {
    a = 100;
    System.out.println("add = "+a);
  }
}
class Inheritance3
{
  public static void main(String[] args)
  {
    Cclass c1 = new Cclass();
    c1.add();
    Bclass b1 = new Bclass();
    b1.add();
  }
}
