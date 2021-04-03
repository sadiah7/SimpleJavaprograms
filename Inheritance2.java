/* Multi Level Inheritance */
class Aclass
{
 int a = 10;
}
class Bclass extends Aclass // Bclass is subclass of Aclass
{
 int b = 50;
}
class Cclass extends Bclass //Cclass is subclass of Bclass
{
  int c;
  void add()
  {
   int c = a + b;
   System.out.println("add = "+c);
  }
}
class Inheritance2
{
  public static void main(String[] args)
  {
    Cclass c1 = new Cclass();
    c1.add();
  }
}
