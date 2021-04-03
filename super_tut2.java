class superclass
{
  superclass()
  {
    System.out.println("super class constructor");
  }
}
class subclass extends superclass
{
  subclass()
  {
    super();
    System.out.println("subclass class constructor");
  }
}
class super_tut
{
  public static void main(String[] args)
  {
  subclass s1 = new subclass();
  }
}
