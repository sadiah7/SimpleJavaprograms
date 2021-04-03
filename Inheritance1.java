/* Single Level Inheritance */
class Aclass
{
 int a = 10;
}
class Bclass extends Aclass // Bclass is subclass of Aclass
{
 int b = 20;
 void add()
 {
  int c = a + b;
  System.out.println("add = "+c);
 }
}
class Inheritance1
{
  public static void main(String[] args)
  {
    Bclass b1 = new Bclass();
    b1.add();
  }
}
